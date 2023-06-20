package com.google.android.ads.mediationtestsuite.dataobjects;

import android.os.Parcel;
import android.os.Parcelable;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import ed.c;

/* loaded from: classes2.dex */
public class Country implements Parcelable {
    public static final Parcelable.Creator<Country> CREATOR = new Parcelable.Creator<Country>() { // from class: com.google.android.ads.mediationtestsuite.dataobjects.Country.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Country createFromParcel(Parcel parcel) {
            return new Country(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Country[] newArray(int i10) {
            return new Country[i10];
        }
    };
    @c(Analytics.Param.CODE)
    private String code;
    @c("name")
    private String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.code);
        parcel.writeString(this.name);
    }

    public Country() {
    }

    private Country(Parcel parcel) {
        this.code = parcel.readString();
        this.name = parcel.readString();
    }
}
