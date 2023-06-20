package vc;

import java.util.Objects;
import vc.c;
import vc.d;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes3.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f38046a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a f38047b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38048c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38049d;

    /* renamed from: e  reason: collision with root package name */
    private final long f38050e;

    /* renamed from: f  reason: collision with root package name */
    private final long f38051f;

    /* renamed from: g  reason: collision with root package name */
    private final String f38052g;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* loaded from: classes3.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f38053a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f38054b;

        /* renamed from: c  reason: collision with root package name */
        private String f38055c;

        /* renamed from: d  reason: collision with root package name */
        private String f38056d;

        /* renamed from: e  reason: collision with root package name */
        private Long f38057e;

        /* renamed from: f  reason: collision with root package name */
        private Long f38058f;

        /* renamed from: g  reason: collision with root package name */
        private String f38059g;

        @Override // vc.d.a
        public d a() {
            String str = "";
            if (this.f38054b == null) {
                str = " registrationStatus";
            }
            if (this.f38057e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f38058f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f38053a, this.f38054b, this.f38055c, this.f38056d, this.f38057e.longValue(), this.f38058f.longValue(), this.f38059g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // vc.d.a
        public d.a b(String str) {
            this.f38055c = str;
            return this;
        }

        @Override // vc.d.a
        public d.a c(long j10) {
            this.f38057e = Long.valueOf(j10);
            return this;
        }

        @Override // vc.d.a
        public d.a d(String str) {
            this.f38053a = str;
            return this;
        }

        @Override // vc.d.a
        public d.a e(String str) {
            this.f38059g = str;
            return this;
        }

        @Override // vc.d.a
        public d.a f(String str) {
            this.f38056d = str;
            return this;
        }

        @Override // vc.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f38054b = aVar;
            return this;
        }

        @Override // vc.d.a
        public d.a h(long j10) {
            this.f38058f = Long.valueOf(j10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(d dVar) {
            this.f38053a = dVar.d();
            this.f38054b = dVar.g();
            this.f38055c = dVar.b();
            this.f38056d = dVar.f();
            this.f38057e = Long.valueOf(dVar.c());
            this.f38058f = Long.valueOf(dVar.h());
            this.f38059g = dVar.e();
        }
    }

    @Override // vc.d
    public String b() {
        return this.f38048c;
    }

    @Override // vc.d
    public long c() {
        return this.f38050e;
    }

    @Override // vc.d
    public String d() {
        return this.f38046a;
    }

    @Override // vc.d
    public String e() {
        return this.f38052g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str3 = this.f38046a;
            if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                if (this.f38047b.equals(dVar.g()) && ((str = this.f38048c) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f38049d) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f38050e == dVar.c() && this.f38051f == dVar.h()) {
                    String str4 = this.f38052g;
                    if (str4 == null) {
                        if (dVar.e() == null) {
                            return true;
                        }
                    } else if (str4.equals(dVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // vc.d
    public String f() {
        return this.f38049d;
    }

    @Override // vc.d
    public c.a g() {
        return this.f38047b;
    }

    @Override // vc.d
    public long h() {
        return this.f38051f;
    }

    public int hashCode() {
        String str = this.f38046a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f38047b.hashCode()) * 1000003;
        String str2 = this.f38048c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f38049d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f38050e;
        long j11 = this.f38051f;
        int i10 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f38052g;
        return i10 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // vc.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f38046a + ", registrationStatus=" + this.f38047b + ", authToken=" + this.f38048c + ", refreshToken=" + this.f38049d + ", expiresInSecs=" + this.f38050e + ", tokenCreationEpochInSecs=" + this.f38051f + ", fisError=" + this.f38052g + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f38046a = str;
        this.f38047b = aVar;
        this.f38048c = str2;
        this.f38049d = str3;
        this.f38050e = j10;
        this.f38051f = j11;
        this.f38052g = str4;
    }
}
