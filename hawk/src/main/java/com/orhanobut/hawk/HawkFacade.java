package com.orhanobut.hawk;

public interface HawkFacade {

    <T> void put(String key, T value);

    <T> T get(String key);

    <T> T get(String key, T defaultValue);

    long count();

    void deleteAll();

    void delete(String key);

    boolean contains(String key);

    boolean isBuilt();

    void destroy();

    class EmptyHawkFacade implements HawkFacade {

        @Override
        public <T> void put(String key, T value) {
            throwValidation();
        }

        @Override
        public <T> T get(String key) {
            throwValidation();
            return null;
        }

        @Override
        public <T> T get(String key, T defaultValue) {
            throwValidation();
            return null;
        }

        @Override
        public long count() {
            throwValidation();
            return 0;
        }

        @Override
        public void deleteAll() {
            throwValidation();
        }

        @Override
        public void delete(String key) {
            throwValidation();
        }

        @Override
        public boolean contains(String key) {
            throwValidation();
            return false;
        }

        @Override
        public boolean isBuilt() {
            return false;
        }

        @Override
        public void destroy() {
            throwValidation();
        }

        private void throwValidation() {
            throw new IllegalStateException("Hawk is not built. " +
                    "Please call build() and wait the initialisation finishes.");
        }
    }
}
