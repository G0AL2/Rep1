package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f22259a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22260b;

    /* renamed from: c  reason: collision with root package name */
    final int f22261c;

    /* renamed from: d  reason: collision with root package name */
    final int f22262d;

    /* renamed from: e  reason: collision with root package name */
    final int f22263e;

    /* renamed from: f  reason: collision with root package name */
    final int f22264f;

    /* renamed from: g  reason: collision with root package name */
    final long f22265g;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.e(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d10 = n.d(calendar);
        this.f22259a = d10;
        this.f22261c = d10.get(2);
        this.f22262d = d10.get(1);
        this.f22263e = d10.getMaximum(7);
        this.f22264f = d10.getActualMaximum(5);
        this.f22260b = n.n().format(d10.getTime());
        this.f22265g = d10.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month e(int i10, int i11) {
        Calendar k10 = n.k();
        k10.set(1, i10);
        k10.set(2, i11);
        return new Month(k10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month f(long j10) {
        Calendar k10 = n.k();
        k10.setTimeInMillis(j10);
        return new Month(k10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month m() {
        return new Month(n.i());
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(Month month) {
        return this.f22259a.compareTo(month.f22259a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.f22261c == month.f22261c && this.f22262d == month.f22262d;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        int firstDayOfWeek = this.f22259a.get(7) - this.f22259a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f22263e : firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h(int i10) {
        Calendar d10 = n.d(this.f22259a);
        d10.set(5, i10);
        return d10.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22261c), Integer.valueOf(this.f22262d)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        return this.f22260b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long j() {
        return this.f22259a.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month k(int i10) {
        Calendar d10 = n.d(this.f22259a);
        d10.add(2, i10);
        return new Month(d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(Month month) {
        if (this.f22259a instanceof GregorianCalendar) {
            return ((month.f22262d - this.f22262d) * 12) + (month.f22261c - this.f22261c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22262d);
        parcel.writeInt(this.f22261c);
    }
}
