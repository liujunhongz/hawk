package com.orhanobut.hawk;

import android.content.Context;
import android.content.SharedPreferences;

final class SharedPreferencesStorage implements Storage {

    private final SharedPreferences preferences;

    SharedPreferencesStorage(Context context, String tag) {
        preferences = context.getSharedPreferences(tag, Context.MODE_PRIVATE);
    }

    SharedPreferencesStorage(SharedPreferences preferences) {
        this.preferences = preferences;
    }

    @Override
    public <T> void put(String key, T value) {
        HawkUtils.checkNull("key", key);
        getEditor().putString(key, String.valueOf(value)).apply();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T get(String key) {
        return (T) preferences.getString(key, null);
    }

    @Override
    public void delete(String key) {
        getEditor().remove(key).apply();
    }

    @Override
    public boolean contains(String key) {
        return preferences.contains(key);
    }

    @Override
    public void deleteAll() {
        getEditor().clear().apply();
    }

    @Override
    public long count() {
        return preferences.getAll().size();
    }

    private SharedPreferences.Editor getEditor() {
        return preferences.edit();
    }

}
