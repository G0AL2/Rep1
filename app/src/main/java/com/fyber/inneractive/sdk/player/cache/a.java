package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public File f17748a;

    /* renamed from: b  reason: collision with root package name */
    public String f17749b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17750c;

    /* renamed from: d  reason: collision with root package name */
    public Object f17751d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f17752e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f17753f = false;

    public a(String str, String str2, File file, boolean z10, String str3) {
        this.f17748a = file;
        this.f17749b = str2;
        this.f17750c = z10;
    }

    public File a() {
        File file;
        synchronized (this.f17751d) {
            file = this.f17748a;
        }
        return file;
    }
}
