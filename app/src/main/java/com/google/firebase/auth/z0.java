package com.google.firebase.auth;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class z0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f23360a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f23361b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TimeUnit f23362c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PhoneAuthProvider.a f23363d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Activity f23364e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Executor f23365f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f23366g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23367h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(FirebaseAuth firebaseAuth, String str, long j10, TimeUnit timeUnit, PhoneAuthProvider.a aVar, Activity activity, Executor executor, boolean z10) {
        this.f23367h = firebaseAuth;
        this.f23360a = str;
        this.f23361b = j10;
        this.f23362c = timeUnit;
        this.f23363d = aVar;
        this.f23364e = activity;
        this.f23365f = executor;
        this.f23366g = z10;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String a10;
        String str;
        if (!task.isSuccessful()) {
            Log.e("FirebaseAuth", "Error while validating application identity: ".concat(String.valueOf(task.getException() != null ? task.getException().getMessage() : "")));
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            a10 = null;
            str = null;
        } else {
            String b10 = ((sb.c0) task.getResult()).b();
            a10 = ((sb.c0) task.getResult()).a();
            str = b10;
        }
        this.f23367h.M(this.f23360a, this.f23361b, this.f23362c, this.f23363d, this.f23364e, this.f23365f, this.f23366g, a10, str);
    }
}
