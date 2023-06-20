package com.google.android.ads.mediationtestsuite.dataobjects;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import ed.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class NetworkSDK implements Parcelable {
    public static final Parcelable.Creator<NetworkSDK> CREATOR = new Parcelable.Creator<NetworkSDK>() { // from class: com.google.android.ads.mediationtestsuite.dataobjects.NetworkSDK.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NetworkSDK createFromParcel(Parcel parcel) {
            return new NetworkSDK(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NetworkSDK[] newArray(int i10) {
            return new NetworkSDK[i10];
        }
    };
    private boolean installationDetected;
    private boolean manifestPresent;
    @c("requiredActivities")
    private List<String> requiredActivities;
    @c("requiredMetadata")
    private List<String> requiredMetadata;
    @c("requiredPermissions")
    private List<String> requiredPermissions;
    @c("requiredProviders")
    private List<String> requiredProviders;
    @c("requiredReceivers")
    private List<String> requiredReceivers;
    @c("sdkDetectionClass")
    private String sdkDetectionClass;
    private boolean sdkPresent;

    public void c() {
        if (this.installationDetected) {
            return;
        }
        boolean d10 = com.google.android.ads.mediationtestsuite.utils.c.d(this.sdkDetectionClass);
        this.sdkPresent = d10;
        if (d10) {
            Log.i("gma_test", "Detected SDK class " + this.sdkDetectionClass);
        } else {
            Log.i("gma_test", "Failed to detect SDK class " + this.sdkDetectionClass);
        }
        boolean z10 = true;
        for (String str : this.requiredActivities) {
            if (com.google.android.ads.mediationtestsuite.utils.c.b(str)) {
                Log.i("gma_test", "Required activity '" + str + "' registered.");
            } else {
                Log.d("gma_test", "Required activity '" + str + "' NOT registered.");
                z10 = false;
            }
        }
        for (String str2 : this.requiredPermissions) {
            if (com.google.android.ads.mediationtestsuite.utils.c.k(str2)) {
                Log.i("gma_test", "Required permission '" + str2 + "' requested.");
            } else {
                Log.d("gma_test", "Required permission '" + str2 + "' NOT requested.");
                z10 = false;
            }
        }
        for (String str3 : this.requiredReceivers) {
            if (com.google.android.ads.mediationtestsuite.utils.c.m(str3)) {
                Log.i("gma_test", "Required receiver'" + str3 + "' requested.");
            } else {
                Log.d("gma_test", "Required receiver '" + str3 + "' NOT requested.");
                z10 = false;
            }
        }
        for (String str4 : this.requiredProviders) {
            if (com.google.android.ads.mediationtestsuite.utils.c.l(str4)) {
                Log.i("gma_test", "Required provider '" + str4 + "' requested.");
            } else {
                Log.d("gma_test", "Required provider '" + str4 + "' NOT requested.");
                z10 = false;
            }
        }
        for (String str5 : this.requiredMetadata) {
            if (com.google.android.ads.mediationtestsuite.utils.c.c(str5)) {
                Log.i("gma_test", "Required metadata '" + str5 + "' requested.");
            } else {
                Log.d("gma_test", "Required metadata '" + str5 + "' NOT requested.");
                z10 = false;
            }
        }
        this.manifestPresent = z10;
        this.installationDetected = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.sdkDetectionClass;
    }

    public boolean equals(Object obj) {
        if (obj instanceof NetworkSDK) {
            return this.sdkDetectionClass.equals(((NetworkSDK) obj).e());
        }
        return super.equals(obj);
    }

    public boolean f() {
        c();
        return this.manifestPresent;
    }

    public boolean g() {
        c();
        return this.sdkPresent;
    }

    public int hashCode() {
        return this.sdkDetectionClass.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.sdkDetectionClass);
        parcel.writeStringList(this.requiredActivities);
        parcel.writeStringList(this.requiredPermissions);
        parcel.writeStringList(this.requiredReceivers);
        parcel.writeStringList(this.requiredProviders);
        parcel.writeStringList(this.requiredMetadata);
    }

    private NetworkSDK(Parcel parcel) {
        this.installationDetected = false;
        boolean[] zArr = new boolean[2];
        parcel.readBooleanArray(zArr);
        this.sdkPresent = zArr[0];
        this.manifestPresent = zArr[1];
        this.sdkDetectionClass = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.requiredActivities = arrayList;
        parcel.readStringList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.requiredPermissions = arrayList2;
        parcel.readStringList(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        this.requiredReceivers = arrayList3;
        parcel.readStringList(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        this.requiredProviders = arrayList4;
        parcel.readStringList(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        this.requiredMetadata = arrayList5;
        parcel.readStringList(arrayList5);
    }
}
