package com.ironsource.mediationsdk.adunit.c.b;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public EnumC0342a f26866a;

    /* renamed from: b  reason: collision with root package name */
    public long f26867b;

    /* renamed from: c  reason: collision with root package name */
    public long f26868c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0342a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public a(EnumC0342a enumC0342a, long j10, long j11) {
        this.f26866a = enumC0342a;
        this.f26867b = j10;
        this.f26868c = j11;
    }

    public final boolean a() {
        EnumC0342a enumC0342a = this.f26866a;
        return enumC0342a == EnumC0342a.MANUAL || enumC0342a == EnumC0342a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    public final boolean b() {
        EnumC0342a enumC0342a = this.f26866a;
        return enumC0342a == EnumC0342a.AUTOMATIC_LOAD_AFTER_CLOSE || enumC0342a == EnumC0342a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
