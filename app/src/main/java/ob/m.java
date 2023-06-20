package ob;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f35194a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35195b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35196c;

    /* renamed from: d  reason: collision with root package name */
    private final String f35197d;

    /* renamed from: e  reason: collision with root package name */
    private final String f35198e;

    /* renamed from: f  reason: collision with root package name */
    private final String f35199f;

    /* renamed from: g  reason: collision with root package name */
    private final String f35200g;

    /* compiled from: FirebaseOptions.java */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f35201a;

        /* renamed from: b  reason: collision with root package name */
        private String f35202b;

        /* renamed from: c  reason: collision with root package name */
        private String f35203c;

        /* renamed from: d  reason: collision with root package name */
        private String f35204d;

        /* renamed from: e  reason: collision with root package name */
        private String f35205e;

        /* renamed from: f  reason: collision with root package name */
        private String f35206f;

        /* renamed from: g  reason: collision with root package name */
        private String f35207g;

        public m a() {
            return new m(this.f35202b, this.f35201a, this.f35203c, this.f35204d, this.f35205e, this.f35206f, this.f35207g);
        }

        public b b(String str) {
            this.f35201a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f35202b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f35203c = str;
            return this;
        }

        @KeepForSdk
        public b e(String str) {
            this.f35204d = str;
            return this;
        }

        public b f(String str) {
            this.f35205e = str;
            return this;
        }

        public b g(String str) {
            this.f35207g = str;
            return this;
        }

        public b h(String str) {
            this.f35206f = str;
            return this;
        }
    }

    public static m a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new m(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String b() {
        return this.f35194a;
    }

    public String c() {
        return this.f35195b;
    }

    public String d() {
        return this.f35196c;
    }

    @KeepForSdk
    public String e() {
        return this.f35197d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            return Objects.equal(this.f35195b, mVar.f35195b) && Objects.equal(this.f35194a, mVar.f35194a) && Objects.equal(this.f35196c, mVar.f35196c) && Objects.equal(this.f35197d, mVar.f35197d) && Objects.equal(this.f35198e, mVar.f35198e) && Objects.equal(this.f35199f, mVar.f35199f) && Objects.equal(this.f35200g, mVar.f35200g);
        }
        return false;
    }

    public String f() {
        return this.f35198e;
    }

    public String g() {
        return this.f35200g;
    }

    public String h() {
        return this.f35199f;
    }

    public int hashCode() {
        return Objects.hashCode(this.f35195b, this.f35194a, this.f35196c, this.f35197d, this.f35198e, this.f35199f, this.f35200g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f35195b).add("apiKey", this.f35194a).add("databaseUrl", this.f35196c).add("gcmSenderId", this.f35198e).add("storageBucket", this.f35199f).add("projectId", this.f35200g).toString();
    }

    private m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f35195b = str;
        this.f35194a = str2;
        this.f35196c = str3;
        this.f35197d = str4;
        this.f35198e = str5;
        this.f35199f = str6;
        this.f35200g = str7;
    }
}
