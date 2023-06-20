package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class b extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    a f26186a;

    /* loaded from: classes3.dex */
    interface a {
        void a(Activity activity);

        void b(Activity activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(Activity activity) {
        return (b) activity.getFragmentManager().findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment") != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new b(), "com.ironsource.lifecycle.IronsourceLifecycleFragment").commit();
        fragmentManager.executePendingTransactions();
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f26186a != null) {
            getActivity();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f26186a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a aVar = this.f26186a;
        if (aVar != null) {
            aVar.b(getActivity());
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a aVar = this.f26186a;
        if (aVar != null) {
            aVar.a(getActivity());
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
    }
}
