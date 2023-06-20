package com.chartboost.sdk.impl;

import java.io.File;

/* loaded from: classes.dex */
public class q1 {

    /* renamed from: a  reason: collision with root package name */
    public final File f14269a;

    /* renamed from: b  reason: collision with root package name */
    public final File f14270b;

    /* renamed from: c  reason: collision with root package name */
    public final File f14271c;

    /* renamed from: d  reason: collision with root package name */
    public final File f14272d;

    /* renamed from: e  reason: collision with root package name */
    public final File f14273e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(File file) {
        File file2 = new File(file, ".chartboost");
        this.f14269a = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        a(file2, "css");
        a(file2, "html");
        a(file2, "images");
        a(file2, "js");
        this.f14270b = a(file2, "templates");
        this.f14271c = a(file2, "videos");
        this.f14272d = a(file2, "precache");
        this.f14273e = a(file2, "precache_queue");
    }

    private static File a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}
