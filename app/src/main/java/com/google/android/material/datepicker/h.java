package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes2.dex */
public final class h<S> extends l<S> {

    /* renamed from: b  reason: collision with root package name */
    private DateSelector<S> f22339b;

    /* renamed from: c  reason: collision with root package name */
    private CalendarConstraints f22340c;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: classes2.dex */
    class a implements k<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.k
        public void a(S s10) {
            Iterator<k<S>> it = h.this.f22355a.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> h<T> d(DateSelector<T> dateSelector, CalendarConstraints calendarConstraints) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f22339b = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f22340c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f22339b.H0(layoutInflater, viewGroup, bundle, this.f22340c, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f22339b);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f22340c);
    }
}
