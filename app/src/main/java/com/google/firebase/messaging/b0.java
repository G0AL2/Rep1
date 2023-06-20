package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import qc.k;

/* compiled from: GmsRpc.java */
/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: a */
    private final ob.e f23465a;

    /* renamed from: b */
    private final g0 f23466b;

    /* renamed from: c */
    private final Rpc f23467c;

    /* renamed from: d */
    private final sc.b<cd.i> f23468d;

    /* renamed from: e */
    private final sc.b<qc.k> f23469e;

    /* renamed from: f */
    private final tc.d f23470f;

    public b0(ob.e eVar, g0 g0Var, sc.b<cd.i> bVar, sc.b<qc.k> bVar2, tc.d dVar) {
        this(eVar, g0Var, new Rpc(eVar.l()), bVar, bVar2, dVar);
    }

    public static /* synthetic */ String a(b0 b0Var, Task task) {
        return b0Var.h(task);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> c(Task<Bundle> task) {
        return task.continueWith(h.f23507a, new Continuation() { // from class: com.google.firebase.messaging.a0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return b0.a(b0.this, task2);
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f23465a.p().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
            throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE);
        }
        throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE);
    }

    public static boolean g(String str) {
        return InstanceID.ERROR_SERVICE_NOT_AVAILABLE.equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public /* synthetic */ String h(Task task) throws Exception {
        return f((Bundle) task.getResult(IOException.class));
    }

    private void i(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        k.a b10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f23465a.q().c());
        bundle.putString("gmsv", Integer.toString(this.f23466b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f23466b.a());
        bundle.putString("app_ver_name", this.f23466b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b11 = ((com.google.firebase.installations.g) Tasks.await(this.f23470f.a(false))).b();
            if (!TextUtils.isEmpty(b11)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f23470f.getId()));
        bundle.putString("cliv", "fcm-23.0.3");
        qc.k kVar = this.f23469e.get();
        cd.i iVar = this.f23468d.get();
        if (kVar == null || iVar == null || (b10 = kVar.b("fire-iid")) == k.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.f()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private Task<Bundle> j(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.f23467c.send(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    public Task<String> e() {
        return c(j(g0.c(this.f23465a), "*", new Bundle()));
    }

    public Task<?> k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(j(str, "/topics/" + str2, bundle));
    }

    public Task<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(j(str, "/topics/" + str2, bundle));
    }

    b0(ob.e eVar, g0 g0Var, Rpc rpc, sc.b<cd.i> bVar, sc.b<qc.k> bVar2, tc.d dVar) {
        this.f23465a = eVar;
        this.f23466b = g0Var;
        this.f23467c = rpc;
        this.f23468d = bVar;
        this.f23469e = bVar2;
        this.f23470f = dVar;
    }
}
