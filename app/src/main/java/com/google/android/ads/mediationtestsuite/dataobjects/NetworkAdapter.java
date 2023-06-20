package com.google.android.ads.mediationtestsuite.dataobjects;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.ads.mediationtestsuite.utils.k;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.VersionInfo;
import ed.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class NetworkAdapter implements Parcelable {
    public static final Parcelable.Creator<NetworkAdapter> CREATOR = new Parcelable.Creator<NetworkAdapter>() { // from class: com.google.android.ads.mediationtestsuite.dataobjects.NetworkAdapter.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NetworkAdapter createFromParcel(Parcel parcel) {
            return new NetworkAdapter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NetworkAdapter[] newArray(int i10) {
            return new NetworkAdapter[i10];
        }
    };
    private boolean adapterPresent;
    @c("className")
    private String className;
    @c("format")
    private AdFormat format;
    private boolean initializerPresent;
    @c("is_rtb")
    private boolean isRtbAdapter;
    private Network network;
    @c("networkLabel")
    private String networkLabel;
    @c("serverParameters")
    private Map<String, String> serverParameters;

    private Adapter e() {
        Class<?> loadClass;
        Class<?> loadClass2;
        try {
            loadClass = NetworkAdapter.class.getClassLoader().loadClass(f());
        } catch (Exception unused) {
        }
        if (loadClass != null && Adapter.class.isAssignableFrom(loadClass)) {
            return (Adapter) loadClass.asSubclass(Adapter.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        if (h() != null && (loadClass2 = NetworkAdapter.class.getClassLoader().loadClass(h())) != null && Adapter.class.isAssignableFrom(loadClass2)) {
            return (Adapter) loadClass2.asSubclass(Adapter.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        return null;
    }

    public void c() {
        boolean d10 = com.google.android.ads.mediationtestsuite.utils.c.d(this.className);
        this.adapterPresent = d10;
        if (d10) {
            Log.i("gma_test", this.className + " class detected.");
        } else {
            Log.d("gma_test", this.className + " class NOT detected.");
        }
        String h10 = h();
        if (h10 != null) {
            this.initializerPresent = com.google.android.ads.mediationtestsuite.utils.c.d(h10);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.className;
    }

    public AdFormat g() {
        return this.format;
    }

    public String h() {
        Network network = this.network;
        if (network != null) {
            return network.g();
        }
        return null;
    }

    public Network i() {
        return this.network;
    }

    public String j() {
        return (k.i() && this.networkLabel.equals("AdMob")) ? "Ad Manager" : this.networkLabel;
    }

    public VersionInfo k() {
        Adapter e10 = e();
        if (e10 == null) {
            return null;
        }
        return e10.getSDKVersionInfo();
    }

    public Map<String, String> l() {
        return this.serverParameters;
    }

    public VersionInfo m() {
        Adapter e10 = e();
        if (e10 == null) {
            return null;
        }
        return e10.getVersionInfo();
    }

    public boolean n() {
        return this.adapterPresent;
    }

    public boolean o() {
        return this.isRtbAdapter;
    }

    public void p(String str) {
        this.className = str;
    }

    public void r(AdFormat adFormat) {
        this.format = adFormat;
    }

    public void s(Network network) {
        this.network = network;
    }

    public void t(String str) {
        this.networkLabel = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBooleanArray(new boolean[]{this.adapterPresent, this.isRtbAdapter, this.initializerPresent});
        parcel.writeString(this.format.getFormatString());
        parcel.writeString(this.className);
        parcel.writeString(this.networkLabel);
        parcel.writeParcelable(this.network, 0);
        parcel.writeInt(this.serverParameters.size());
        for (String str : this.serverParameters.keySet()) {
            parcel.writeString(str);
            parcel.writeString(this.serverParameters.get(str));
        }
    }

    public NetworkAdapter() {
        this.serverParameters = new HashMap();
    }

    private NetworkAdapter(Parcel parcel) {
        boolean[] zArr = new boolean[3];
        parcel.readBooleanArray(zArr);
        this.adapterPresent = zArr[0];
        this.isRtbAdapter = zArr[1];
        this.initializerPresent = zArr[2];
        this.format = AdFormat.from(parcel.readString());
        this.className = parcel.readString();
        this.networkLabel = parcel.readString();
        this.network = (Network) parcel.readParcelable(Network.class.getClassLoader());
        this.serverParameters = new HashMap();
        int readInt = parcel.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            this.serverParameters.put(parcel.readString(), parcel.readString());
        }
    }
}
