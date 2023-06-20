package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Month f22245a;

    /* renamed from: b  reason: collision with root package name */
    private final Month f22246b;

    /* renamed from: c  reason: collision with root package name */
    private final Month f22247c;

    /* renamed from: d  reason: collision with root package name */
    private final DateValidator f22248d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22249e;

    /* renamed from: f  reason: collision with root package name */
    private final int f22250f;

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
        boolean b(long j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        static final long f22251e = n.a(Month.e(1900, 0).f22265g);

        /* renamed from: f  reason: collision with root package name */
        static final long f22252f = n.a(Month.e(2100, 11).f22265g);

        /* renamed from: a  reason: collision with root package name */
        private long f22253a;

        /* renamed from: b  reason: collision with root package name */
        private long f22254b;

        /* renamed from: c  reason: collision with root package name */
        private Long f22255c;

        /* renamed from: d  reason: collision with root package name */
        private DateValidator f22256d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(CalendarConstraints calendarConstraints) {
            this.f22253a = f22251e;
            this.f22254b = f22252f;
            this.f22256d = DateValidatorPointForward.c(Long.MIN_VALUE);
            this.f22253a = calendarConstraints.f22245a.f22265g;
            this.f22254b = calendarConstraints.f22246b.f22265g;
            this.f22255c = Long.valueOf(calendarConstraints.f22247c.f22265g);
            this.f22256d = calendarConstraints.f22248d;
        }

        public CalendarConstraints a() {
            if (this.f22255c == null) {
                long s10 = f.s();
                long j10 = this.f22253a;
                if (j10 > s10 || s10 > this.f22254b) {
                    s10 = j10;
                }
                this.f22255c = Long.valueOf(s10);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f22256d);
            return new CalendarConstraints(Month.f(this.f22253a), Month.f(this.f22254b), Month.f(this.f22255c.longValue()), (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null);
        }

        public b b(long j10) {
            this.f22255c = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator, a aVar) {
        this(month, month2, month3, dateValidator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.f22245a.equals(calendarConstraints.f22245a) && this.f22246b.equals(calendarConstraints.f22246b) && this.f22247c.equals(calendarConstraints.f22247c) && this.f22248d.equals(calendarConstraints.f22248d);
        }
        return false;
    }

    public DateValidator h() {
        return this.f22248d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22245a, this.f22246b, this.f22247c, this.f22248d});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month i() {
        return this.f22246b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f22250f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month k() {
        return this.f22247c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month l() {
        return this.f22245a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.f22249e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22245a, 0);
        parcel.writeParcelable(this.f22246b, 0);
        parcel.writeParcelable(this.f22247c, 0);
        parcel.writeParcelable(this.f22248d, 0);
    }

    private CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator) {
        this.f22245a = month;
        this.f22246b = month2;
        this.f22247c = month3;
        this.f22248d = dateValidator;
        if (month.compareTo(month3) <= 0) {
            if (month3.compareTo(month2) <= 0) {
                this.f22250f = month.l(month2) + 1;
                this.f22249e = (month2.f22262d - month.f22262d) + 1;
                return;
            }
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }
}
