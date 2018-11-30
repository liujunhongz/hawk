package com.orhanobut.hawk;

import android.text.TextUtils;

import com.squareup.moshi.Moshi;

import java.io.IOException;
import java.lang.reflect.Type;

public final class MoshiParser implements Parser {

    private final Moshi mMoshi;

    public MoshiParser(Moshi gson) {
        this.mMoshi = gson;
    }

    @Override
    public <T> T fromJson(String content, Type type) throws IOException {
        if (TextUtils.isEmpty(content)) {
            return null;
        }
        return mMoshi.<T>adapter(type).fromJson(content);
    }

    @Override
    public String toJson(Object body) {
        return mMoshi.adapter(Object.class).toJson(body);
    }

}
