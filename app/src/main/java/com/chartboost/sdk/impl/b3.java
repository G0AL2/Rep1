package com.chartboost.sdk.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;

/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f13927a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13928b;

    /* renamed from: c  reason: collision with root package name */
    private final File f13929c;

    /* renamed from: d  reason: collision with root package name */
    private final File f13930d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13931e;

    /* renamed from: f  reason: collision with root package name */
    private final String f13932f;

    /* renamed from: g  reason: collision with root package name */
    private long f13933g;

    public b3(String str, String str2, File file, File file2, long j10, String str3, long j11) {
        qe.k.f(str, ImagesContract.URL);
        qe.k.f(str2, "filename");
        qe.k.f(str3, "queueFilePath");
        this.f13927a = str;
        this.f13928b = str2;
        this.f13929c = file;
        this.f13930d = file2;
        this.f13931e = j10;
        this.f13932f = str3;
        this.f13933g = j11;
    }

    public final long a() {
        return this.f13931e;
    }

    public final File b() {
        return this.f13930d;
    }

    public final long c() {
        return this.f13933g;
    }

    public final String d() {
        return this.f13928b;
    }

    public final File e() {
        return this.f13929c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b3) {
            b3 b3Var = (b3) obj;
            return qe.k.a(this.f13927a, b3Var.f13927a) && qe.k.a(this.f13928b, b3Var.f13928b) && qe.k.a(this.f13929c, b3Var.f13929c) && qe.k.a(this.f13930d, b3Var.f13930d) && this.f13931e == b3Var.f13931e && qe.k.a(this.f13932f, b3Var.f13932f) && this.f13933g == b3Var.f13933g;
        }
        return false;
    }

    public final String f() {
        return this.f13932f;
    }

    public final String g() {
        return this.f13927a;
    }

    public int hashCode() {
        int hashCode = ((this.f13927a.hashCode() * 31) + this.f13928b.hashCode()) * 31;
        File file = this.f13929c;
        int hashCode2 = (hashCode + (file == null ? 0 : file.hashCode())) * 31;
        File file2 = this.f13930d;
        return ((((((hashCode2 + (file2 != null ? file2.hashCode() : 0)) * 31) + o3.a(this.f13931e)) * 31) + this.f13932f.hashCode()) * 31) + o3.a(this.f13933g);
    }

    public String toString() {
        return "VideoAsset(url=" + this.f13927a + ", filename=" + this.f13928b + ", localFile=" + this.f13929c + ", directory=" + this.f13930d + ", creationDate=" + this.f13931e + ", queueFilePath=" + this.f13932f + ", expectedFileSize=" + this.f13933g + ')';
    }

    public final void a(long j10) {
        this.f13933g = j10;
    }

    public /* synthetic */ b3(String str, String str2, File file, File file2, long j10, String str3, long j11, int i10, qe.g gVar) {
        this(str, str2, file, file2, (i10 & 16) != 0 ? System.currentTimeMillis() : j10, (i10 & 32) != 0 ? "" : str3, (i10 & 64) != 0 ? 0L : j11);
    }
}
