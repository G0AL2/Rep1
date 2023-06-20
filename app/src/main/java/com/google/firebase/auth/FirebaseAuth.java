package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p002firebaseauthapi.zzte;
import com.google.android.gms.internal.p002firebaseauthapi.zzti;
import com.google.android.gms.internal.p002firebaseauthapi.zztn;
import com.google.android.gms.internal.p002firebaseauthapi.zztx;
import com.google.android.gms.internal.p002firebaseauthapi.zzuv;
import com.google.android.gms.internal.p002firebaseauthapi.zzvf;
import com.google.android.gms.internal.p002firebaseauthapi.zzwe;
import com.google.android.gms.internal.p002firebaseauthapi.zzwr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public abstract class FirebaseAuth implements sb.b {

    /* renamed from: a  reason: collision with root package name */
    private ob.e f23210a;

    /* renamed from: b  reason: collision with root package name */
    private final List f23211b;

    /* renamed from: c  reason: collision with root package name */
    private final List f23212c;

    /* renamed from: d  reason: collision with root package name */
    private List f23213d;

    /* renamed from: e  reason: collision with root package name */
    private zzte f23214e;

    /* renamed from: f  reason: collision with root package name */
    private FirebaseUser f23215f;

    /* renamed from: g  reason: collision with root package name */
    private sb.q0 f23216g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f23217h;

    /* renamed from: i  reason: collision with root package name */
    private String f23218i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f23219j;

    /* renamed from: k  reason: collision with root package name */
    private String f23220k;

    /* renamed from: l  reason: collision with root package name */
    private final sb.t f23221l;

    /* renamed from: m  reason: collision with root package name */
    private final sb.z f23222m;

    /* renamed from: n  reason: collision with root package name */
    private final sb.d0 f23223n;

    /* renamed from: o  reason: collision with root package name */
    private final sc.b f23224o;

    /* renamed from: p  reason: collision with root package name */
    private sb.v f23225p;

    /* renamed from: q  reason: collision with root package name */
    private sb.w f23226q;

    /* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
    /* loaded from: classes3.dex */
    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    /* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
    /* loaded from: classes3.dex */
    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    public FirebaseAuth(ob.e eVar, sc.b bVar) {
        zzwe b10;
        zzte zzteVar = new zzte(eVar);
        sb.t tVar = new sb.t(eVar.l(), eVar.r());
        sb.z b11 = sb.z.b();
        sb.d0 b12 = sb.d0.b();
        this.f23211b = new CopyOnWriteArrayList();
        this.f23212c = new CopyOnWriteArrayList();
        this.f23213d = new CopyOnWriteArrayList();
        this.f23217h = new Object();
        this.f23219j = new Object();
        this.f23226q = sb.w.a();
        this.f23210a = (ob.e) Preconditions.checkNotNull(eVar);
        this.f23214e = (zzte) Preconditions.checkNotNull(zzteVar);
        sb.t tVar2 = (sb.t) Preconditions.checkNotNull(tVar);
        this.f23221l = tVar2;
        this.f23216g = new sb.q0();
        sb.z zVar = (sb.z) Preconditions.checkNotNull(b11);
        this.f23222m = zVar;
        this.f23223n = (sb.d0) Preconditions.checkNotNull(b12);
        this.f23224o = bVar;
        FirebaseUser a10 = tVar2.a();
        this.f23215f = a10;
        if (a10 != null && (b10 = tVar2.b(a10)) != null) {
            K(this, this.f23215f, b10, false, false);
        }
        zVar.d(this);
    }

    public static void I(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            String e10 = firebaseUser.e();
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + e10 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f23226q.execute(new x0(firebaseAuth));
    }

    public static void J(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            String e10 = firebaseUser.e();
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + e10 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.f23226q.execute(new w0(firebaseAuth, new yc.b(firebaseUser != null ? firebaseUser.zze() : null)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public static void K(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzwe zzweVar, boolean z10, boolean z11) {
        boolean z12;
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzweVar);
        boolean z13 = false;
        boolean z14 = true;
        boolean z15 = firebaseAuth.f23215f != null && firebaseUser.e().equals(firebaseAuth.f23215f.e());
        if (z15 || !z11) {
            FirebaseUser firebaseUser2 = firebaseAuth.f23215f;
            if (firebaseUser2 == null) {
                z12 = true;
            } else {
                z13 = (!z15 || (firebaseUser2.F1().zze().equals(zzweVar.zze()) ^ true)) ? true : true;
                z12 = true ^ z15;
                z14 = z13;
            }
            Preconditions.checkNotNull(firebaseUser);
            FirebaseUser firebaseUser3 = firebaseAuth.f23215f;
            if (firebaseUser3 == null) {
                firebaseAuth.f23215f = firebaseUser;
            } else {
                firebaseUser3.E1(firebaseUser.n1());
                if (!firebaseUser.p1()) {
                    firebaseAuth.f23215f.D1();
                }
                firebaseAuth.f23215f.H1(firebaseUser.m1().a());
            }
            if (z10) {
                firebaseAuth.f23221l.d(firebaseAuth.f23215f);
            }
            if (z14) {
                FirebaseUser firebaseUser4 = firebaseAuth.f23215f;
                if (firebaseUser4 != null) {
                    firebaseUser4.G1(zzweVar);
                }
                J(firebaseAuth, firebaseAuth.f23215f);
            }
            if (z12) {
                I(firebaseAuth, firebaseAuth.f23215f);
            }
            if (z10) {
                firebaseAuth.f23221l.e(firebaseUser, zzweVar);
            }
            FirebaseUser firebaseUser5 = firebaseAuth.f23215f;
            if (firebaseUser5 != null) {
                g0(firebaseAuth).d(firebaseUser5.F1());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneAuthProvider.a O(String str, PhoneAuthProvider.a aVar) {
        return (this.f23216g.f() && str != null && str.equals(this.f23216g.c())) ? new b1(this, aVar) : aVar;
    }

    private final boolean P(String str) {
        e c10 = e.c(str);
        return (c10 == null || TextUtils.equals(this.f23220k, c10.d())) ? false : true;
    }

    public static sb.v g0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f23225p == null) {
            firebaseAuth.f23225p = new sb.v((ob.e) Preconditions.checkNotNull(firebaseAuth.f23210a));
        }
        return firebaseAuth.f23225p;
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) ob.e.n().j(FirebaseAuth.class);
    }

    public void A() {
        synchronized (this.f23217h) {
            this.f23218i = zztx.zza();
        }
    }

    public void B(String str, int i10) {
        Preconditions.checkNotEmpty(str);
        boolean z10 = false;
        if (i10 >= 0 && i10 <= 65535) {
            z10 = true;
        }
        Preconditions.checkArgument(z10, "Port number must be in the range 0-65535");
        zzvf.zzf(this.f23210a, str, i10);
    }

    public Task<String> C(String str) {
        Preconditions.checkNotEmpty(str);
        return this.f23214e.zzM(this.f23210a, str, this.f23220k);
    }

    public final void G() {
        Preconditions.checkNotNull(this.f23221l);
        FirebaseUser firebaseUser = this.f23215f;
        if (firebaseUser != null) {
            sb.t tVar = this.f23221l;
            Preconditions.checkNotNull(firebaseUser);
            tVar.c(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.e()));
            this.f23215f = null;
        }
        this.f23221l.c("com.google.firebase.auth.FIREBASE_USER");
        J(this, null);
        I(this, null);
    }

    public final void H(FirebaseUser firebaseUser, zzwe zzweVar, boolean z10) {
        K(this, firebaseUser, zzweVar, true, false);
    }

    public final void L(z zVar) {
        String checkNotEmpty;
        if (zVar.l()) {
            FirebaseAuth c10 = zVar.c();
            if (((zzag) Preconditions.checkNotNull(zVar.d())).zze()) {
                checkNotEmpty = Preconditions.checkNotEmpty(zVar.i());
            } else {
                checkNotEmpty = Preconditions.checkNotEmpty(((PhoneMultiFactorInfo) Preconditions.checkNotNull(zVar.g())).e());
            }
            if (zVar.e() == null || !zzuv.zzd(checkNotEmpty, zVar.f(), (Activity) Preconditions.checkNotNull(zVar.b()), zVar.j())) {
                c10.f23223n.a(c10, zVar.i(), (Activity) Preconditions.checkNotNull(zVar.b()), c10.N()).addOnCompleteListener(new a1(c10, zVar));
                return;
            }
            return;
        }
        FirebaseAuth c11 = zVar.c();
        String checkNotEmpty2 = Preconditions.checkNotEmpty(zVar.i());
        long longValue = zVar.h().longValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        PhoneAuthProvider.a f10 = zVar.f();
        Activity activity = (Activity) Preconditions.checkNotNull(zVar.b());
        Executor j10 = zVar.j();
        boolean z10 = zVar.e() != null;
        if (z10 || !zzuv.zzd(checkNotEmpty2, f10, activity, j10)) {
            c11.f23223n.a(c11, checkNotEmpty2, activity, c11.N()).addOnCompleteListener(new z0(c11, checkNotEmpty2, longValue, timeUnit, f10, activity, j10, z10));
        }
    }

    public final void M(String str, long j10, TimeUnit timeUnit, PhoneAuthProvider.a aVar, Activity activity, Executor executor, boolean z10, String str2, String str3) {
        long convert = TimeUnit.SECONDS.convert(j10, timeUnit);
        if (convert >= 0 && convert <= 120) {
            this.f23214e.zzO(this.f23210a, new zzwr(str, convert, z10, this.f23218i, this.f23220k, str2, N(), str3), O(str, aVar), activity, executor);
            return;
        }
        throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean N() {
        return zztn.zza(i().l());
    }

    public final Task Q(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        return this.f23214e.zze(firebaseUser, new t0(this, firebaseUser));
    }

    public final Task R(FirebaseUser firebaseUser, boolean z10) {
        if (firebaseUser == null) {
            return Tasks.forException(zzti.zza(new Status(17495)));
        }
        zzwe F1 = firebaseUser.F1();
        String zzf = F1.zzf();
        if (!F1.zzj() || z10) {
            if (zzf != null) {
                return this.f23214e.zzi(this.f23210a, firebaseUser, zzf, new y0(this));
            }
            return Tasks.forException(zzti.zza(new Status(17096)));
        }
        return Tasks.forResult(com.google.firebase.auth.internal.b.a(F1.zze()));
    }

    public final Task S(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        return this.f23214e.zzj(this.f23210a, firebaseUser, authCredential.k1(), new d1(this));
    }

    public final Task T(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(authCredential);
        AuthCredential k12 = authCredential.k1();
        if (k12 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) k12;
            if ("password".equals(emailAuthCredential.l1())) {
                return this.f23214e.zzp(this.f23210a, firebaseUser, emailAuthCredential.zzd(), Preconditions.checkNotEmpty(emailAuthCredential.zze()), firebaseUser.o1(), new d1(this));
            }
            if (P(Preconditions.checkNotEmpty(emailAuthCredential.zzf()))) {
                return Tasks.forException(zzti.zza(new Status(17072)));
            }
            return this.f23214e.zzn(this.f23210a, firebaseUser, emailAuthCredential, new d1(this));
        } else if (k12 instanceof PhoneAuthCredential) {
            return this.f23214e.zzr(this.f23210a, firebaseUser, (PhoneAuthCredential) k12, this.f23220k, new d1(this));
        } else {
            return this.f23214e.zzl(this.f23210a, firebaseUser, k12, firebaseUser.o1(), new d1(this));
        }
    }

    public final Task U(FirebaseUser firebaseUser, sb.x xVar) {
        Preconditions.checkNotNull(firebaseUser);
        return this.f23214e.zzs(this.f23210a, firebaseUser, xVar);
    }

    public final Task V(ActionCodeSettings actionCodeSettings, String str) {
        Preconditions.checkNotEmpty(str);
        if (this.f23218i != null) {
            if (actionCodeSettings == null) {
                actionCodeSettings = ActionCodeSettings.q1();
            }
            actionCodeSettings.r1(this.f23218i);
        }
        return this.f23214e.zzt(this.f23210a, actionCodeSettings, str);
    }

    public final Task W(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        return this.f23214e.zzG(this.f23210a, firebaseUser, str, new d1(this));
    }

    public final Task X(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotEmpty(str);
        return this.f23214e.zzH(this.f23210a, firebaseUser, str, new d1(this));
    }

    public final Task Y(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotEmpty(str);
        return this.f23214e.zzI(this.f23210a, firebaseUser, str, new d1(this));
    }

    public final Task Z(FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(phoneAuthCredential);
        return this.f23214e.zzJ(this.f23210a, firebaseUser, phoneAuthCredential.clone(), new d1(this));
    }

    public void a(a aVar) {
        this.f23213d.add(aVar);
        this.f23226q.execute(new v0(this, aVar));
    }

    public final Task a0(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(userProfileChangeRequest);
        return this.f23214e.zzK(this.f23210a, firebaseUser, userProfileChangeRequest, new d1(this));
    }

    public void b(b bVar) {
        this.f23211b.add(bVar);
        ((sb.w) Preconditions.checkNotNull(this.f23226q)).execute(new u0(this, bVar));
    }

    public final Task b0(String str, String str2, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.q1();
        }
        String str3 = this.f23218i;
        if (str3 != null) {
            actionCodeSettings.r1(str3);
        }
        return this.f23214e.zzL(str, str2, actionCodeSettings);
    }

    public Task<Void> c(String str) {
        Preconditions.checkNotEmpty(str);
        return this.f23214e.zza(this.f23210a, str, this.f23220k);
    }

    public Task<d> d(String str) {
        Preconditions.checkNotEmpty(str);
        return this.f23214e.zzb(this.f23210a, str, this.f23220k);
    }

    public Task<Void> e(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return this.f23214e.zzc(this.f23210a, str, str2, this.f23220k);
    }

    public Task<AuthResult> f(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return this.f23214e.zzd(this.f23210a, str, str2, this.f23220k, new c1(this));
    }

    public Task<b0> g(String str) {
        Preconditions.checkNotEmpty(str);
        return this.f23214e.zzf(this.f23210a, str, this.f23220k);
    }

    public final Task h(boolean z10) {
        return R(this.f23215f, z10);
    }

    public final sc.b h0() {
        return this.f23224o;
    }

    public ob.e i() {
        return this.f23210a;
    }

    public FirebaseUser j() {
        return this.f23215f;
    }

    public p k() {
        return this.f23216g;
    }

    public String l() {
        String str;
        synchronized (this.f23217h) {
            str = this.f23218i;
        }
        return str;
    }

    public String m() {
        String str;
        synchronized (this.f23219j) {
            str = this.f23220k;
        }
        return str;
    }

    public void n(a aVar) {
        this.f23213d.remove(aVar);
    }

    public void o(b bVar) {
        this.f23211b.remove(bVar);
    }

    public Task<Void> p(String str) {
        Preconditions.checkNotEmpty(str);
        return q(str, null);
    }

    public Task<Void> q(String str, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.q1();
        }
        String str2 = this.f23218i;
        if (str2 != null) {
            actionCodeSettings.r1(str2);
        }
        actionCodeSettings.s1(1);
        return this.f23214e.zzu(this.f23210a, str, actionCodeSettings, this.f23220k);
    }

    public Task<Void> r(String str, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(actionCodeSettings);
        if (actionCodeSettings.j1()) {
            String str2 = this.f23218i;
            if (str2 != null) {
                actionCodeSettings.r1(str2);
            }
            return this.f23214e.zzv(this.f23210a, str, actionCodeSettings, this.f23220k);
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    public void s(String str) {
        Preconditions.checkNotEmpty(str);
        synchronized (this.f23217h) {
            this.f23218i = str;
        }
    }

    public void t(String str) {
        Preconditions.checkNotEmpty(str);
        synchronized (this.f23219j) {
            this.f23220k = str;
        }
    }

    public Task<AuthResult> u() {
        FirebaseUser firebaseUser = this.f23215f;
        if (firebaseUser != null && firebaseUser.p1()) {
            zzx zzxVar = (zzx) this.f23215f;
            zzxVar.O1(false);
            return Tasks.forResult(new zzr(zzxVar));
        }
        return this.f23214e.zzx(this.f23210a, new c1(this), this.f23220k);
    }

    public Task<AuthResult> v(AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        AuthCredential k12 = authCredential.k1();
        if (k12 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) k12;
            if (!emailAuthCredential.zzg()) {
                return this.f23214e.zzA(this.f23210a, emailAuthCredential.zzd(), Preconditions.checkNotEmpty(emailAuthCredential.zze()), this.f23220k, new c1(this));
            }
            if (P(Preconditions.checkNotEmpty(emailAuthCredential.zzf()))) {
                return Tasks.forException(zzti.zza(new Status(17072)));
            }
            return this.f23214e.zzB(this.f23210a, emailAuthCredential, new c1(this));
        } else if (k12 instanceof PhoneAuthCredential) {
            return this.f23214e.zzC(this.f23210a, (PhoneAuthCredential) k12, this.f23220k, new c1(this));
        } else {
            return this.f23214e.zzy(this.f23210a, k12, this.f23220k, new c1(this));
        }
    }

    public Task<AuthResult> w(String str) {
        Preconditions.checkNotEmpty(str);
        c1 c1Var = new c1(this);
        Preconditions.checkNotEmpty(str);
        return this.f23214e.zzz(this.f23210a, str, this.f23220k, c1Var);
    }

    public Task<AuthResult> x(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return this.f23214e.zzA(this.f23210a, str, str2, this.f23220k, new c1(this));
    }

    public Task<AuthResult> y(String str, String str2) {
        return v(f.b(str, str2));
    }

    public void z() {
        G();
        sb.v vVar = this.f23225p;
        if (vVar != null) {
            vVar.c();
        }
    }

    @Keep
    public static FirebaseAuth getInstance(ob.e eVar) {
        return (FirebaseAuth) eVar.j(FirebaseAuth.class);
    }
}
