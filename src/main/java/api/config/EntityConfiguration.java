package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return CreateUserService.class;
        }

    },

    CREATETOKEN{
        @Override
        public Class<?> getEntityService() {
            return CreateTokenService.class;
        }
    };


    public abstract Class<?> getEntityService();
}
