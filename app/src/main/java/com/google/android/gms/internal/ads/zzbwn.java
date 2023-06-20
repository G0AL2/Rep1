package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwn extends zzbwv {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbwn(zzcli zzcliVar, Map map) {
        super(zzcliVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcliVar.zzk();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j10 = this.zzd;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.zze;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbhj(this.zzb).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        builder.setTitle(zzd != null ? zzd.getString(R.string.f21964s5) : "Create calendar event");
        builder.setMessage(zzd != null ? zzd.getString(R.string.f21965s6) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(zzd != null ? zzd.getString(R.string.f21962s3) : "Accept", new zzbwl(this));
        builder.setNegativeButton(zzd != null ? zzd.getString(R.string.f21963s4) : "Decline", new zzbwm(this));
        builder.create().show();
    }
}
