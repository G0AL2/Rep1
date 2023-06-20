package com.fyber.inneractive.sdk.bidder;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.util.l;

/* loaded from: classes.dex */
public class e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final d f16817a;

    public e(d dVar) {
        this.f16817a = dVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        char c10;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        action.getClass();
        boolean z10 = false;
        switch (action.hashCode()) {
            case -1538406691:
                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1530327060:
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1076576821:
                if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1123270207:
                if (action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1779291251:
                if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 2070024785:
                if (action.equals("android.media.RINGER_MODE_CHANGED")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2106958107:
                if (action.equals("android.app.action.INTERRUPTION_FILTER_CHANGED")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                a aVar = (a) this.f16817a;
                aVar.f16743b.getClass();
                int intExtra = intent.getIntExtra("plugged", -1);
                z10 = (intExtra == 1 || intExtra == 2 || intExtra == 4) ? true : true;
                Boolean bool = aVar.f16744c.E;
                if (bool == null || bool.booleanValue() != z10) {
                    aVar.f16744c.E = Boolean.valueOf(z10);
                    aVar.b();
                }
                if (TextUtils.equals(aVar.f16744c.F, aVar.f16743b.a(intent))) {
                    return;
                }
                aVar.f16744c.F = aVar.f16743b.a(intent);
                aVar.b();
                return;
            case 1:
            case 3:
                a aVar2 = (a) this.f16817a;
                aVar2.getClass();
                Boolean bool2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", RecyclerView.UNDEFINED_DURATION) == 2 ? Boolean.TRUE : null;
                c cVar = aVar2.f16744c;
                if (cVar.f16810u != bool2) {
                    cVar.f16810u = bool2;
                    aVar2.b();
                    return;
                }
                return;
            case 2:
                a aVar3 = (a) this.f16817a;
                aVar3.f16744c.f16813x = Boolean.valueOf(intent.getBooleanExtra("state", false));
                aVar3.b();
                return;
            case 4:
                a aVar4 = (a) this.f16817a;
                aVar4.f16744c.f16811v = com.fyber.inneractive.sdk.serverapi.a.n();
                aVar4.b();
                return;
            case 5:
                a aVar5 = (a) this.f16817a;
                aVar5.getClass();
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
                z10 = (intExtra2 == 0 || intExtra2 == 1) ? true : true;
                Boolean bool3 = aVar5.f16744c.f16815z;
                if (bool3 == null || bool3.booleanValue() != z10) {
                    aVar5.f16744c.f16815z = Boolean.valueOf(z10);
                    aVar5.b();
                    return;
                }
                return;
            case 6:
                a aVar6 = (a) this.f16817a;
                aVar6.getClass();
                int currentInterruptionFilter = ((NotificationManager) l.f20301a.getSystemService("notification")).getCurrentInterruptionFilter();
                if (currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4) {
                    z10 = true;
                }
                Boolean bool4 = aVar6.f16744c.f16814y;
                if (bool4 == null || bool4.booleanValue() != z10) {
                    aVar6.f16744c.f16814y = Boolean.valueOf(z10);
                    aVar6.b();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
