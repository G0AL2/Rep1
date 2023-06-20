package com.fyber.inneractive.sdk.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public class c0 {
    public static String a(long j10, long j11) {
        return new SimpleDateFormat("ss:S", Locale.getDefault()).format(new Date((System.currentTimeMillis() - j10) - j11));
    }
}
