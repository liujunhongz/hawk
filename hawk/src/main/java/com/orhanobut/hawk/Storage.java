package com.orhanobut.hawk;

/**
 * Intermediate layer which stores the given data. Used by Hawk.
 *
 * <p>Use custom implementation if the built-in implementations are not enough.</p>
 *
 * @see SharedPreferencesStorage
 */
public interface Storage {

  /**
   * Put a single entry to storage
   *
   * @param key   the name of entry to put
   * @param value the value of entry
   * @param <T>   type of value of entry
   *
   */
  <T> void put(String key, T value);

  /**
   * Get single entry from storage
   *
   * @param key the name of entry to get
   * @param <T> type of value of entry
   *
   * @return the object related to given key
   */
  <T> T get(String key);

  /**
   * Remove single entry from storage
   *
   * @param key the name of entry to delete
   *
   */
  void delete(String key);

  /**
   * Remove all entries in the storage
   *
   */
  void deleteAll();

  /**
   * Retrieve count of entries in the storage
   *
   * @return entry count in the storage
   */
  long count();

  /**
   * Checks whether the storage contains an entry.
   *
   * @param key the name of entry to check
   *
   * @return true if the entry exists in the storage, otherwise false
   */
  boolean contains(String key);

}
