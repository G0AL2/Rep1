package com.fyber.inneractive.sdk.web;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
public class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f20435b;

    public k(d dVar, String str) {
        this.f20435b = dVar;
        this.f20434a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f20435b.a(this.f20434a);
    }
}
