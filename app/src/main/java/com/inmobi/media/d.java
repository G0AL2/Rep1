package com.inmobi.media;

import android.app.Activity;
import android.content.Context;

/* compiled from: InMobiAdRequest.java */
/* loaded from: classes3.dex */
public final class d {
    public static String a(Context context) {
        return context instanceof Activity ? "activity" : "others";
    }
}
