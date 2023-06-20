package com.android.billingclient.api;

import com.android.billingclient.api.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final e f6070a;

    /* renamed from: b  reason: collision with root package name */
    static final e f6071b;

    /* renamed from: c  reason: collision with root package name */
    static final e f6072c;

    /* renamed from: d  reason: collision with root package name */
    static final e f6073d;

    /* renamed from: e  reason: collision with root package name */
    static final e f6074e;

    /* renamed from: f  reason: collision with root package name */
    static final e f6075f;

    /* renamed from: g  reason: collision with root package name */
    static final e f6076g;

    /* renamed from: h  reason: collision with root package name */
    static final e f6077h;

    /* renamed from: i  reason: collision with root package name */
    static final e f6078i;

    /* renamed from: j  reason: collision with root package name */
    static final e f6079j;

    /* renamed from: k  reason: collision with root package name */
    static final e f6080k;

    /* renamed from: l  reason: collision with root package name */
    static final e f6081l;

    /* renamed from: m  reason: collision with root package name */
    static final e f6082m;

    /* renamed from: n  reason: collision with root package name */
    static final e f6083n;

    /* renamed from: o  reason: collision with root package name */
    static final e f6084o;

    /* renamed from: p  reason: collision with root package name */
    static final e f6085p;

    /* renamed from: q  reason: collision with root package name */
    static final e f6086q;

    /* renamed from: r  reason: collision with root package name */
    static final e f6087r;

    static {
        e.a c10 = e.c();
        c10.c(3);
        c10.b("Google Play In-app Billing API version is less than 3");
        f6070a = c10.a();
        e.a c11 = e.c();
        c11.c(3);
        c11.b("Google Play In-app Billing API version is less than 9");
        f6071b = c11.a();
        e.a c12 = e.c();
        c12.c(3);
        c12.b("Billing service unavailable on device.");
        f6072c = c12.a();
        e.a c13 = e.c();
        c13.c(5);
        c13.b("Client is already in the process of connecting to billing service.");
        f6073d = c13.a();
        e.a c14 = e.c();
        c14.c(5);
        c14.b("The list of SKUs can't be empty.");
        f6074e = c14.a();
        e.a c15 = e.c();
        c15.c(5);
        c15.b("SKU type can't be empty.");
        f6075f = c15.a();
        e.a c16 = e.c();
        c16.c(5);
        c16.b("Product type can't be empty.");
        f6076g = c16.a();
        e.a c17 = e.c();
        c17.c(-2);
        c17.b("Client does not support extra params.");
        f6077h = c17.a();
        e.a c18 = e.c();
        c18.c(5);
        c18.b("Invalid purchase token.");
        f6078i = c18.a();
        e.a c19 = e.c();
        c19.c(6);
        c19.b("An internal error occurred.");
        f6079j = c19.a();
        e.a c20 = e.c();
        c20.c(5);
        c20.b("SKU can't be null.");
        c20.a();
        e.a c21 = e.c();
        c21.c(0);
        f6080k = c21.a();
        e.a c22 = e.c();
        c22.c(-1);
        c22.b("Service connection is disconnected.");
        f6081l = c22.a();
        e.a c23 = e.c();
        c23.c(-3);
        c23.b("Timeout communicating with service.");
        f6082m = c23.a();
        e.a c24 = e.c();
        c24.c(-2);
        c24.b("Client does not support subscriptions.");
        f6083n = c24.a();
        e.a c25 = e.c();
        c25.c(-2);
        c25.b("Client does not support subscriptions update.");
        c25.a();
        e.a c26 = e.c();
        c26.c(-2);
        c26.b("Client does not support get purchase history.");
        c26.a();
        e.a c27 = e.c();
        c27.c(-2);
        c27.b("Client does not support price change confirmation.");
        c27.a();
        e.a c28 = e.c();
        c28.c(-2);
        c28.b("Client does not support billing on VR.");
        c28.a();
        e.a c29 = e.c();
        c29.c(-2);
        c29.b("Play Store version installed does not support cross selling products.");
        c29.a();
        e.a c30 = e.c();
        c30.c(-2);
        c30.b("Client does not support multi-item purchases.");
        f6084o = c30.a();
        e.a c31 = e.c();
        c31.c(-2);
        c31.b("Client does not support offer_id_token.");
        f6085p = c31.a();
        e.a c32 = e.c();
        c32.c(-2);
        c32.b("Client does not support ProductDetails.");
        f6086q = c32.a();
        e.a c33 = e.c();
        c33.c(-2);
        c33.b("Client does not support in-app messages.");
        c33.a();
        e.a c34 = e.c();
        c34.c(-2);
        c34.b("Client does not support alternative billing.");
        f6087r = c34.a();
        e.a c35 = e.c();
        c35.c(5);
        c35.b("Unknown feature");
        c35.a();
    }
}
