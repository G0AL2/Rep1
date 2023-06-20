package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.facebook.react.modules.dialog.DialogModule;
import com.vehiclecloud.app.videofetch.rnbillingclient.RNBillingClientModule;

/* compiled from: AlertFragment.java */
/* loaded from: classes.dex */
public class a extends c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final DialogModule.b f15555a;

    public a() {
        this.f15555a = null;
    }

    public static Dialog b(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey(RNBillingClientModule.Result.Params.ITEMS)) {
            title.setItems(bundle.getCharSequenceArray(RNBillingClientModule.Result.Params.ITEMS), onClickListener);
        }
        return title.create();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        DialogModule.b bVar = this.f15555a;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i10);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        return b(getActivity(), getArguments(), this);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.b bVar = this.f15555a;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }

    @SuppressLint({"ValidFragment"})
    public a(DialogModule.b bVar, Bundle bundle) {
        this.f15555a = bVar;
        setArguments(bundle);
    }
}
