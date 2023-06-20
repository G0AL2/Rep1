package com.google.firebase.auth;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzag;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseAuth f23340a;

    /* renamed from: b  reason: collision with root package name */
    private Long f23341b;

    /* renamed from: c  reason: collision with root package name */
    private PhoneAuthProvider.a f23342c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f23343d;

    /* renamed from: e  reason: collision with root package name */
    private String f23344e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f23345f;

    /* renamed from: g  reason: collision with root package name */
    private PhoneAuthProvider.ForceResendingToken f23346g;

    /* renamed from: h  reason: collision with root package name */
    private MultiFactorSession f23347h;

    /* renamed from: i  reason: collision with root package name */
    private PhoneMultiFactorInfo f23348i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f23349j;

    /* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final FirebaseAuth f23350a;

        /* renamed from: b  reason: collision with root package name */
        private String f23351b;

        /* renamed from: c  reason: collision with root package name */
        private Long f23352c;

        /* renamed from: d  reason: collision with root package name */
        private PhoneAuthProvider.a f23353d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f23354e;

        /* renamed from: f  reason: collision with root package name */
        private Activity f23355f;

        /* renamed from: g  reason: collision with root package name */
        private PhoneAuthProvider.ForceResendingToken f23356g;

        /* renamed from: h  reason: collision with root package name */
        private MultiFactorSession f23357h;

        /* renamed from: i  reason: collision with root package name */
        private PhoneMultiFactorInfo f23358i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f23359j;

        public a(FirebaseAuth firebaseAuth) {
            this.f23350a = (FirebaseAuth) Preconditions.checkNotNull(firebaseAuth);
        }

        public z a() {
            Preconditions.checkNotNull(this.f23350a, "FirebaseAuth instance cannot be null");
            Preconditions.checkNotNull(this.f23352c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            Preconditions.checkNotNull(this.f23353d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            Preconditions.checkNotNull(this.f23355f, "You must specify an Activity on your PhoneAuthOptions. Please call #setActivity()");
            this.f23354e = TaskExecutors.MAIN_THREAD;
            if (this.f23352c.longValue() >= 0 && this.f23352c.longValue() <= 120) {
                MultiFactorSession multiFactorSession = this.f23357h;
                if (multiFactorSession == null) {
                    Preconditions.checkNotEmpty(this.f23351b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                    Preconditions.checkArgument(!this.f23359j, "You cannot require sms validation without setting a multi-factor session.");
                    Preconditions.checkArgument(this.f23358i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                } else if (((zzag) multiFactorSession).zze()) {
                    Preconditions.checkNotEmpty(this.f23351b);
                    Preconditions.checkArgument(this.f23358i == null, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
                } else {
                    Preconditions.checkArgument(this.f23358i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                    Preconditions.checkArgument(this.f23351b == null, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
                }
                return new z(this.f23350a, this.f23352c, this.f23353d, this.f23354e, this.f23351b, this.f23355f, this.f23356g, this.f23357h, this.f23358i, this.f23359j, null);
            }
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }

        public a b(Activity activity) {
            this.f23355f = activity;
            return this;
        }

        public a c(PhoneAuthProvider.a aVar) {
            this.f23353d = aVar;
            return this;
        }

        public a d(PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            this.f23356g = forceResendingToken;
            return this;
        }

        public a e(String str) {
            this.f23351b = str;
            return this;
        }

        public a f(Long l10, TimeUnit timeUnit) {
            this.f23352c = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    /* synthetic */ z(FirebaseAuth firebaseAuth, Long l10, PhoneAuthProvider.a aVar, Executor executor, String str, Activity activity, PhoneAuthProvider.ForceResendingToken forceResendingToken, MultiFactorSession multiFactorSession, PhoneMultiFactorInfo phoneMultiFactorInfo, boolean z10, i0 i0Var) {
        this.f23340a = firebaseAuth;
        this.f23344e = str;
        this.f23341b = l10;
        this.f23342c = aVar;
        this.f23345f = activity;
        this.f23343d = executor;
        this.f23346g = forceResendingToken;
        this.f23347h = multiFactorSession;
        this.f23348i = phoneMultiFactorInfo;
        this.f23349j = z10;
    }

    public static a a(FirebaseAuth firebaseAuth) {
        return new a(firebaseAuth);
    }

    public final Activity b() {
        return this.f23345f;
    }

    public final FirebaseAuth c() {
        return this.f23340a;
    }

    public final MultiFactorSession d() {
        return this.f23347h;
    }

    public final PhoneAuthProvider.ForceResendingToken e() {
        return this.f23346g;
    }

    public final PhoneAuthProvider.a f() {
        return this.f23342c;
    }

    public final PhoneMultiFactorInfo g() {
        return this.f23348i;
    }

    public final Long h() {
        return this.f23341b;
    }

    public final String i() {
        return this.f23344e;
    }

    public final Executor j() {
        return this.f23343d;
    }

    public final boolean k() {
        return this.f23349j;
    }

    public final boolean l() {
        return this.f23347h != null;
    }
}
