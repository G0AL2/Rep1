package com.ironsource.sdk.g;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f28128a;

    /* renamed from: b  reason: collision with root package name */
    public String f28129b;

    /* renamed from: c  reason: collision with root package name */
    public String f28130c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28131d;

    /* renamed from: e  reason: collision with root package name */
    public int f28132e;

    /* renamed from: f  reason: collision with root package name */
    public String f28133f;

    /* renamed from: g  reason: collision with root package name */
    public String f28134g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f28135h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f28136i;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, String> f28137j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<String> f28138k;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<String> f28139l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<String> f28140m;

    /* renamed from: n  reason: collision with root package name */
    private Map<String, String> f28141n;

    /* loaded from: classes3.dex */
    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b() {
        e();
    }

    private b(Parcel parcel) {
        e();
        try {
            boolean z10 = true;
            this.f28131d = parcel.readByte() != 0;
            this.f28132e = parcel.readInt();
            this.f28128a = parcel.readString();
            this.f28129b = parcel.readString();
            this.f28130c = parcel.readString();
            this.f28133f = parcel.readString();
            this.f28134g = parcel.readString();
            this.f28141n = c(parcel.readString());
            this.f28136i = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z10 = false;
            }
            this.f28135h = z10;
            this.f28137j = c(parcel.readString());
        } catch (Throwable unused) {
            e();
        }
    }

    /* synthetic */ b(Parcel parcel, byte b10) {
        this(parcel);
    }

    private static Map<String, String> c(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    private void e() {
        this.f28131d = false;
        this.f28132e = -1;
        this.f28138k = new ArrayList<>();
        this.f28139l = new ArrayList<>();
        this.f28140m = new ArrayList<>();
        new ArrayList();
        this.f28135h = true;
        this.f28136i = false;
        this.f28134g = "";
        this.f28133f = "";
        this.f28141n = new HashMap();
        this.f28137j = new HashMap();
    }

    public final void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str) || this.f28140m.indexOf(str) != -1) {
            return;
        }
        this.f28140m.add(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("shouldRestore:");
            sb2.append(this.f28131d);
            sb2.append(", ");
            sb2.append("displayedProduct:");
            sb2.append(this.f28132e);
            sb2.append(", ");
            sb2.append("ISReportInit:");
            sb2.append(this.f28138k);
            sb2.append(", ");
            sb2.append("ISInitSuccess:");
            sb2.append(this.f28139l);
            sb2.append(", ");
            sb2.append("ISAppKey");
            sb2.append(this.f28133f);
            sb2.append(", ");
            sb2.append("ISUserId");
            sb2.append(this.f28134g);
            sb2.append(", ");
            sb2.append("ISExtraParams");
            sb2.append(this.f28141n);
            sb2.append(", ");
            sb2.append("OWReportInit");
            sb2.append(this.f28135h);
            sb2.append(", ");
            sb2.append("OWInitSuccess");
            sb2.append(this.f28136i);
            sb2.append(", ");
            sb2.append("OWExtraParams");
            sb2.append(this.f28137j);
            sb2.append(", ");
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        try {
            int i11 = 1;
            parcel.writeByte((byte) (this.f28131d ? 1 : 0));
            parcel.writeInt(this.f28132e);
            parcel.writeString(this.f28128a);
            parcel.writeString(this.f28129b);
            parcel.writeString(this.f28130c);
            parcel.writeString(this.f28133f);
            parcel.writeString(this.f28134g);
            parcel.writeString(new JSONObject(this.f28141n).toString());
            parcel.writeByte((byte) (this.f28136i ? 1 : 0));
            if (!this.f28135h) {
                i11 = 0;
            }
            parcel.writeByte((byte) i11);
            parcel.writeString(new JSONObject(this.f28137j).toString());
        } catch (Throwable unused) {
        }
    }
}
