package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final long f22257a;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<DateValidatorPointForward> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i10) {
            return new DateValidatorPointForward[i10];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j10, a aVar) {
        this(j10);
    }

    public static DateValidatorPointForward c(long j10) {
        return new DateValidatorPointForward(j10);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean b(long j10) {
        return j10 >= this.f22257a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f22257a == ((DateValidatorPointForward) obj).f22257a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f22257a)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f22257a);
    }

    private DateValidatorPointForward(long j10) {
        this.f22257a = j10;
    }
}
