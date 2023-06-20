package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes.dex */
public class u extends t {

    /* renamed from: a  reason: collision with root package name */
    public final int f17506a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17507b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17508c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17509d;

    public u(int i10, int i11, int i12, int i13) {
        this.f17506a = i12;
        this.f17507b = i13;
        this.f17509d = i11;
        this.f17508c = i10;
    }

    @Override // com.fyber.inneractive.sdk.mraid.t
    public String a() {
        return "currentPosition: { x: " + this.f17508c + ", y: " + this.f17509d + ", width: " + this.f17506a + ", height: " + this.f17507b + " }";
    }
}
