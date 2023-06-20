package com.google.android.ads.mediationtestsuite.dataobjects;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ads.mediationtestsuite.utils.k;
import ed.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class Network implements Parcelable {
    public static final Parcelable.Creator<Network> CREATOR = new Parcelable.Creator<Network>() { // from class: com.google.android.ads.mediationtestsuite.dataobjects.Network.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Network createFromParcel(Parcel parcel) {
            return new Network(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Network[] newArray(int i10) {
            return new Network[i10];
        }
    };
    @c("buyerNetworkId")
    private Integer buyerNetworkId;
    private List<NetworkConfig> configs;
    private NetworkSDK detectedSDK;
    @c("initializerClass")
    private String initializerClass;
    @c("name")
    private String name;
    @c("sdks")
    private final List<NetworkSDK> sdks;

    public void c(NetworkConfig networkConfig) {
        this.configs.add(networkConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
        for (NetworkSDK networkSDK : this.sdks) {
            if (networkSDK.g()) {
                this.detectedSDK = networkSDK;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Network) {
            return this.name.equals(((Network) obj).h());
        }
        return super.equals(obj);
    }

    public Integer f() {
        return this.buyerNetworkId;
    }

    public String g() {
        return this.initializerClass;
    }

    public String h() {
        return (k.i() && this.name.equals("AdMob")) ? "Ad Manager" : this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public boolean i() {
        NetworkSDK networkSDK = this.detectedSDK;
        return networkSDK != null && networkSDK.f();
    }

    public boolean j() {
        NetworkSDK networkSDK = this.detectedSDK;
        return networkSDK != null && networkSDK.g();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        NetworkSDK[] newArray = NetworkSDK.CREATOR.newArray(this.sdks.size());
        this.sdks.toArray(newArray);
        parcel.writeParcelableArray(newArray, 0);
        parcel.writeString(this.name);
        parcel.writeString(this.initializerClass);
    }

    public Network() {
        this.sdks = new ArrayList();
        this.configs = new ArrayList();
    }

    private Network(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.sdks = arrayList;
        Collections.addAll(arrayList, (NetworkSDK[]) parcel.readParcelableArray(NetworkSDK.class.getClassLoader()));
        this.name = parcel.readString();
        this.initializerClass = parcel.readString();
        this.configs = new ArrayList();
    }
}
