package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    long f27715a;

    /* renamed from: b  reason: collision with root package name */
    int f27716b;

    /* renamed from: c  reason: collision with root package name */
    int f27717c;

    /* renamed from: d  reason: collision with root package name */
    b f27718d = b.NONE;

    /* renamed from: e  reason: collision with root package name */
    private String f27719e;

    /* renamed from: f  reason: collision with root package name */
    private String f27720f;

    /* renamed from: g  reason: collision with root package name */
    private com.ironsource.sdk.k.b f27721g;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f27722a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f27723b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f27724c = 3;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ int[] f27725d = {1, 2, 3};

        public static int[] a() {
            return (int[]) f27725d.clone();
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        

        /* renamed from: g  reason: collision with root package name */
        int f27733g;

        b(int i10) {
            this.f27733g = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class c extends JSONObject {
        c() {
            putOpt("controllerSourceStrategy", Integer.valueOf(f.this.f27716b));
            putOpt("controllerSourceCode", Integer.valueOf(f.this.f27718d.f27733g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27735a;

        static {
            int[] iArr = new int[a.a().length];
            f27735a = iArr;
            try {
                int i10 = a.f27722a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f27735a;
                int i11 = a.f27723b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f27735a;
                int i12 = a.f27724c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(JSONObject jSONObject, String str, String str2, com.ironsource.sdk.k.b bVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.f27716b = optInt;
        this.f27717c = optInt != 1 ? optInt != 2 ? a.f27722a : a.f27724c : a.f27723b;
        this.f27719e = str;
        this.f27720f = str2;
        this.f27721g = bVar;
    }

    private void b(com.ironsource.sdk.h.c cVar) {
        if (this.f27721g.b()) {
            return;
        }
        this.f27721g.a(cVar, this.f27720f);
    }

    private com.ironsource.sdk.h.c i() {
        return new com.ironsource.sdk.h.c(this.f27719e, "next_mobileController.html");
    }

    private com.ironsource.sdk.h.c j() {
        return new com.ironsource.sdk.h.c(this.f27719e, "fallback_mobileController.html");
    }

    private void k() {
        try {
            com.ironsource.sdk.h.c f10 = f();
            if (f10.exists()) {
                com.ironsource.sdk.h.c j10 = j();
                if (j10.exists()) {
                    j10.delete();
                }
                IronSourceStorageUtils.renameFile(f10.getPath(), j10.getPath());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(this.f27716b)).a("controllersource", Integer.valueOf(bVar.f27733g));
        if (this.f27715a > 0) {
            a10.a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.f27715a));
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27601s, a10.f27575a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.f27718d != b.NONE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        com.ironsource.sdk.h.c cVar;
        int i10 = d.f27735a[this.f27717c - 1];
        if (i10 == 1) {
            IronSourceStorageUtils.deleteFile(f());
            cVar = new com.ironsource.sdk.h.c(this.f27719e, SDKUtils.getFileName(this.f27720f));
        } else if (i10 != 2) {
            if (i10 == 3) {
                try {
                    com.ironsource.sdk.h.c f10 = f();
                    com.ironsource.sdk.h.c i11 = i();
                    if (!i11.exists() && !f10.exists()) {
                        b(new com.ironsource.sdk.h.c(this.f27719e, SDKUtils.getFileName(this.f27720f)));
                        return false;
                    } else if (!i11.exists() && f10.exists()) {
                        b bVar = b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f27718d = bVar;
                        a(bVar);
                        b(new com.ironsource.sdk.h.c(this.f27719e, i11.getName()));
                        return true;
                    } else {
                        k();
                        if (IronSourceStorageUtils.renameFile(i().getPath(), f().getPath())) {
                            b bVar2 = b.PREPARED_CONTROLLER_LOADED;
                            this.f27718d = bVar2;
                            a(bVar2);
                            e();
                            b(new com.ironsource.sdk.h.c(this.f27719e, i11.getName()));
                            return true;
                        } else if (g()) {
                            b bVar3 = b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f27718d = bVar3;
                            a(bVar3);
                            b(new com.ironsource.sdk.h.c(this.f27719e, i11.getName()));
                            return true;
                        } else {
                            b(new com.ironsource.sdk.h.c(this.f27719e, SDKUtils.getFileName(this.f27720f)));
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } else {
            k();
            cVar = new com.ironsource.sdk.h.c(this.f27719e, SDKUtils.getFileName(this.f27720f));
        }
        b(cVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        IronSourceStorageUtils.deleteFile(j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.ironsource.sdk.h.c f() {
        return new com.ironsource.sdk.h.c(this.f27719e, "mobileController.html");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        try {
            if (j().exists()) {
                return IronSourceStorageUtils.renameFile(j().getPath(), f().getPath());
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject h() {
        return new c();
    }
}
