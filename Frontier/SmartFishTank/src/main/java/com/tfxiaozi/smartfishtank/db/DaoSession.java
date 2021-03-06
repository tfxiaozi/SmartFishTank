package com.tfxiaozi.smartfishtank.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.tfxiaozi.smartfishtank.db.CameraResource;
import com.tfxiaozi.smartfishtank.db.DomesticCity;
import com.tfxiaozi.smartfishtank.db.TimmingdbData;

import com.tfxiaozi.smartfishtank.db.CameraResourceDao;
import com.tfxiaozi.smartfishtank.db.DomesticCityDao;
import com.tfxiaozi.smartfishtank.db.TimmingdbDataDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cameraResourceDaoConfig;
    private final DaoConfig domesticCityDaoConfig;
    private final DaoConfig timmingdbDataDaoConfig;

    private final CameraResourceDao cameraResourceDao;
    private final DomesticCityDao domesticCityDao;
    private final TimmingdbDataDao timmingdbDataDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        cameraResourceDaoConfig = daoConfigMap.get(CameraResourceDao.class).clone();
        cameraResourceDaoConfig.initIdentityScope(type);

        domesticCityDaoConfig = daoConfigMap.get(DomesticCityDao.class).clone();
        domesticCityDaoConfig.initIdentityScope(type);

        timmingdbDataDaoConfig = daoConfigMap.get(TimmingdbDataDao.class).clone();
        timmingdbDataDaoConfig.initIdentityScope(type);

        cameraResourceDao = new CameraResourceDao(cameraResourceDaoConfig, this);
        domesticCityDao = new DomesticCityDao(domesticCityDaoConfig, this);
        timmingdbDataDao = new TimmingdbDataDao(timmingdbDataDaoConfig, this);

        registerDao(CameraResource.class, cameraResourceDao);
        registerDao(DomesticCity.class, domesticCityDao);
        registerDao(TimmingdbData.class, timmingdbDataDao);
    }
    
    public void clear() {
        cameraResourceDaoConfig.clearIdentityScope();
        domesticCityDaoConfig.clearIdentityScope();
        timmingdbDataDaoConfig.clearIdentityScope();
    }

    public CameraResourceDao getCameraResourceDao() {
        return cameraResourceDao;
    }

    public DomesticCityDao getDomesticCityDao() {
        return domesticCityDao;
    }

    public TimmingdbDataDao getTimmingdbDataDao() {
        return timmingdbDataDao;
    }

}
