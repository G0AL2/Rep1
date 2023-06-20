package com.google.firebase.remoteconfig.internal;

/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* loaded from: classes3.dex */
public class q implements dd.p {

    /* renamed from: a  reason: collision with root package name */
    private final String f23699a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23700b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(String str, int i10) {
        this.f23699a = str;
        this.f23700b = i10;
    }

    private void a() {
        if (this.f23699a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // dd.p
    public String asString() {
        if (this.f23700b == 0) {
            return "";
        }
        a();
        return this.f23699a;
    }

    @Override // dd.p
    public int getSource() {
        return this.f23700b;
    }
}
