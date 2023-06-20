package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class HeifExifUtil {

    @com.facebook.soloader.e
    /* loaded from: classes.dex */
    private static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        static int a(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e10) {
                z3.a.e("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e10);
                return 0;
            }
        }
    }

    public static int a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.a(inputStream);
        }
        z3.a.b("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
