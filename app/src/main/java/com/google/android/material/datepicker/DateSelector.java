package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    View H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, k<S> kVar);

    boolean Q0();

    Collection<Long> T0();

    S X0();

    int a(Context context);

    String d(Context context);

    void d1(long j10);

    Collection<h0.d<Long, Long>> s0();
}
