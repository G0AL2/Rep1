package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import j3.a;
import java.io.File;

/* loaded from: classes.dex */
public class CacheDirFactory {
    public static volatile a MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    public static volatile a TTVIDEO_CACHE_DIR = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f10555a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f10556b = 1;

    private static a a() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    MEDIA_CACHE_DIR = new w2.a();
                    MEDIA_CACHE_DIR.a(getRootDir());
                    MEDIA_CACHE_DIR.c();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getBrandCacheDir() {
        return getRootDir() + File.separator + "video_brand";
    }

    public static int getCacheType() {
        return f10556b;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }

    public static a getICacheDir(int i10) {
        return a();
    }

    public static String getImageCacheDir() {
        if (f10555a == null) {
            f10555a = getDiskCacheDirPath("image");
        }
        return f10555a;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File a10 = f.a(m.a(), b.c(), "tt_ad");
        if (a10.isFile()) {
            a10.delete();
        }
        if (!a10.exists()) {
            a10.mkdirs();
        }
        String absolutePath = a10.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }
}
