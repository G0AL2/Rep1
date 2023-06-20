package com.chartboost.sdk.impl;

import android.util.Log;
import java.io.File;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class s2 {
    public File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        return new File(file, qe.k.l(str, ".tmp"));
    }

    public boolean b(File file, String str) {
        if (file != null && str != null) {
            try {
                File a10 = a(file, str);
                if (a10 == null) {
                    return false;
                }
                return a10.exists();
            } catch (Exception e10) {
                Log.d("TempFileDownloadHelper", e10.toString());
            }
        }
        return false;
    }

    public RandomAccessFile a(File file) {
        if (file != null) {
            return new RandomAccessFile(file, "rwd");
        }
        return null;
    }
}
