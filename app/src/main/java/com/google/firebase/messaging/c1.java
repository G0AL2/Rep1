package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.f1;

/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes3.dex */
class c1 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final a f23478a;

    /* compiled from: WithinAppServiceBinder.java */
    /* loaded from: classes3.dex */
    interface a {
        Task<Void> a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(a aVar) {
        this.f23478a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final f1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f23478a.a(aVar.f23497a).addOnCompleteListener(h.f23507a, new OnCompleteListener() { // from class: com.google.firebase.messaging.b1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    f1.a.this.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
