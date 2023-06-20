package com.bytedance.sdk.component.b.a.b;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: Segment.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f10014a;

    /* renamed from: b  reason: collision with root package name */
    int f10015b;

    /* renamed from: c  reason: collision with root package name */
    int f10016c;

    /* renamed from: d  reason: collision with root package name */
    boolean f10017d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10018e;

    /* renamed from: f  reason: collision with root package name */
    e f10019f;

    /* renamed from: g  reason: collision with root package name */
    e f10020g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        this.f10014a = new byte[Constants.BUFFER_SIZE];
        this.f10018e = true;
        this.f10017d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e a() {
        this.f10017d = true;
        return new e(this.f10014a, this.f10015b, this.f10016c, true, false);
    }

    public final e b() {
        e eVar = this.f10019f;
        e eVar2 = eVar != this ? eVar : null;
        e eVar3 = this.f10020g;
        if (eVar3 != null) {
            eVar3.f10019f = eVar;
        }
        e eVar4 = this.f10019f;
        if (eVar4 != null) {
            eVar4.f10020g = eVar3;
        }
        this.f10019f = null;
        this.f10020g = null;
        return eVar2;
    }

    public final e a(e eVar) {
        eVar.f10020g = this;
        eVar.f10019f = this.f10019f;
        this.f10019f.f10020g = eVar;
        this.f10019f = eVar;
        return eVar;
    }

    e(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f10014a = bArr;
        this.f10015b = i10;
        this.f10016c = i11;
        this.f10017d = z10;
        this.f10018e = z11;
    }
}
