package com.bytedance.sdk.openadsdk.b;

import com.inmobi.media.au;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AdEventConstants.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f11006a = new HashSet(Arrays.asList(au.CLICK_BEACON, "show", "insight_log"));

    public static boolean a(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
