package com.jasper.blog.services;

import java.io.Serializable;


public interface SettingService {
    Serializable get(String key);
    Serializable get(String key, Serializable defaultValue);
    void put(String key, Serializable value);
}
