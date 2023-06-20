package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.applovin.sdk.AppLovinEventParameters;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import fm.castbox.mediation.model.NetworkName;
import fm.castbox.mediation.widget.AdView;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfbl {
    public final String zzA;
    public final zzccg zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfcg zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbyb zzae;
    public final boolean zzaf;
    public final com.google.android.gms.ads.internal.client.zzs zzag;
    public final String zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final JSONObject zzal;
    public final boolean zzam;
    public final String zzan;
    public final boolean zzao;
    public final String zzap;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzcax zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfbq zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v249, types: [java.util.List] */
    public zzfbl(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List list;
        List list2;
        char c10;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfrj zzo = zzfrj.zzo();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        zzfrj zzfrjVar = zzo;
        zzfbq zzfbqVar = null;
        zzccg zzccgVar = null;
        zzbyb zzbybVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        String str = null;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i11 = -1;
        int i12 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        int i13 = 0;
        int i14 = -1;
        boolean z20 = false;
        boolean z21 = true;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        List list3 = emptyList11;
        List list4 = emptyList12;
        List list5 = emptyList13;
        List list6 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        zzcax zzcaxVar = null;
        String str17 = str16;
        String str18 = str17;
        int i15 = 0;
        int i16 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str19 = nextName == null ? "" : nextName;
            switch (str19.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_source_instance_name")) {
                        c10 = ':';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("debug_signals")) {
                        c10 = 28;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("omid_settings")) {
                        c10 = ')';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("play_prewarm_options")) {
                        c10 = '1';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_source_name")) {
                        c10 = '8';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_interscroller")) {
                        c10 = '5';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("backend_query_id")) {
                        c10 = '/';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("nofill_urls")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_custom_close_blocked")) {
                        c10 = '#';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals(AdUnitActivity.EXTRA_ORIENTATION)) {
                        c10 = '%';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("enable_omid")) {
                        c10 = '\'';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("buffer_click_url_as_ready_to_ping")) {
                        c10 = 'B';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("showable_impression_type")) {
                        c10 = ',';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_cover")) {
                        c10 = '6';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_sizes")) {
                        c10 = 19;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("adapters")) {
                        c10 = 20;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("test_mode_enabled")) {
                        c10 = '\"';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("extras")) {
                        c10 = 29;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_event_value")) {
                        c10 = '3';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("allow_pub_rendered_attribution")) {
                        c10 = 30;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("presentation_error_urls")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_type")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_scroll_aware")) {
                        c10 = '+';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("fill_urls")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("allocation_id")) {
                        c10 = 21;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("video_complete_urls")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("active_view")) {
                        c10 = 25;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("valid_from_timestamp")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_source_instance_id")) {
                        c10 = ';';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("click_urls")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("safe_browsing")) {
                        c10 = 26;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("imp_urls")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("rtb_native_required_assets")) {
                        c10 = '=';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("render_timeout_ms")) {
                        c10 = '&';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_close_time_ms")) {
                        c10 = '-';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("content_url")) {
                        c10 = '?';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_close_button_enabled")) {
                        c10 = '2';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("force_disable_hardware_acceleration")) {
                        c10 = '@';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("watermark")) {
                        c10 = '.';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("native_required_asset_viewability")) {
                        c10 = '>';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_offline_ad")) {
                        c10 = '<';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("allow_custom_click_gesture")) {
                        c10 = ' ';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad")) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("id")) {
                        c10 = 23;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("data")) {
                        c10 = 22;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("request_id")) {
                        c10 = 'C';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("render_test_label")) {
                        c10 = '!';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("qdata")) {
                        c10 = 24;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_load_urls")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_closable_area_disabled")) {
                        c10 = '$';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("presentation_error_timeout_ms")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("debug_dialog_string")) {
                        c10 = 27;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("container_sizes")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("impression_type")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER)) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("rewards")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("cache_hit_urls")) {
                        c10 = 'A';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("allow_pub_owned_ad_view")) {
                        c10 = 31;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_source_id")) {
                        c10 = '9';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("bid_response")) {
                        c10 = '(';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("video_start_urls")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("ad_network_class_name")) {
                        c10 = '7';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("video_reward_urls")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("use_third_party_container_height")) {
                        c10 = '0';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("renderers")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("is_analytics_logging_enabled")) {
                        c10 = '*';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str19.equals("rule_line_external_id")) {
                        c10 = '4';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str19.equals("manual_tracking_urls")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 1:
                    i15 = zzb(jsonReader.nextString());
                    break;
                case 2:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 3:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 4:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 5:
                    i16 = zzc(jsonReader.nextInt());
                    break;
                case 6:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 7:
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case '\b':
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case '\t':
                    str18 = jsonReader.nextString();
                    break;
                case '\n':
                    str17 = jsonReader.nextString();
                    break;
                case 11:
                    zzcaxVar = zzcax.zza(com.google.android.gms.ads.internal.util.zzbu.zze(jsonReader));
                    break;
                case '\f':
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case '\r':
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    continue;
                    emptyList10 = list2;
                case 14:
                    list2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 15:
                    list3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 16:
                    i10 = jsonReader.nextInt();
                    break;
                case 17:
                    list4 = zzfbm.zza(jsonReader);
                    break;
                case 18:
                    zzfbqVar = new zzfbq(jsonReader);
                    break;
                case 19:
                    list6 = zzfbm.zza(jsonReader);
                    break;
                case 20:
                    list5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    break;
                case 22:
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 23:
                    str3 = jsonReader.nextString();
                    break;
                case 24:
                    str4 = jsonReader.nextString();
                    break;
                case 25:
                    str5 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader).toString();
                    break;
                case 26:
                    zzccgVar = zzccg.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    break;
                case 27:
                    str6 = jsonReader.nextString();
                    break;
                case 28:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 29:
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case 30:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 31:
                    z11 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z12 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z13 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    z14 = jsonReader.nextBoolean();
                    break;
                case '#':
                    z15 = jsonReader.nextBoolean();
                    break;
                case '$':
                    z16 = jsonReader.nextBoolean();
                    break;
                case '%':
                    i11 = zzd(jsonReader.nextString());
                    break;
                case '&':
                    i12 = jsonReader.nextInt();
                    break;
                case '\'':
                    z17 = jsonReader.nextBoolean();
                    break;
                case '(':
                    str7 = jsonReader.nextString();
                    break;
                case ')':
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case '*':
                    z18 = jsonReader.nextBoolean();
                    break;
                case '+':
                    z19 = jsonReader.nextBoolean();
                    break;
                case ',':
                    i13 = jsonReader.nextInt();
                    break;
                case '-':
                    i14 = jsonReader.nextInt();
                    break;
                case '.':
                    str8 = jsonReader.nextString();
                    break;
                case '/':
                    str9 = jsonReader.nextString();
                    break;
                case '0':
                    z20 = jsonReader.nextBoolean();
                    break;
                case '1':
                    zzbybVar = zzbyb.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    break;
                case '2':
                    z21 = jsonReader.nextBoolean();
                    break;
                case '3':
                    zzsVar = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    break;
                case '4':
                    str10 = jsonReader.nextString();
                    break;
                case '5':
                    z22 = jsonReader.nextBoolean();
                    break;
                case '6':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case '7':
                    str11 = jsonReader.nextString();
                    break;
                case '8':
                    if (((Boolean) zzbhz.zzfL.zzl()).booleanValue()) {
                        str12 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case '9':
                    if (((Boolean) zzbhz.zzfL.zzl()).booleanValue()) {
                        str13 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case ':':
                    if (((Boolean) zzbhz.zzfL.zzl()).booleanValue()) {
                        str14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case ';':
                    if (((Boolean) zzbhz.zzfL.zzl()).booleanValue()) {
                        str15 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case '<':
                    z23 = jsonReader.nextBoolean();
                    break;
                case '=':
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    break;
                case '>':
                    z24 = jsonReader.nextBoolean();
                    break;
                case '?':
                    str = jsonReader.nextString();
                    break;
                case '@':
                    z25 = jsonReader.nextBoolean();
                    break;
                case 'A':
                    zzfrjVar = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    break;
                case 'B':
                    z26 = jsonReader.nextBoolean();
                    break;
                case 'C':
                    str16 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            emptyList9 = list;
            emptyList10 = list2;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i15;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i16;
        this.zzh = emptyList5;
        this.zzi = emptyList6;
        this.zzj = emptyList7;
        this.zzk = str18;
        this.zzl = str17;
        this.zzm = zzcaxVar;
        this.zzn = emptyList8;
        this.zzo = emptyList9;
        this.zzp = emptyList10;
        this.zzq = list3;
        this.zzr = i10;
        this.zzs = list4;
        this.zzt = zzfbqVar;
        this.zzu = list5;
        this.zzv = list6;
        this.zzx = str2;
        this.zzw = jSONObject12;
        this.zzy = str3;
        this.zzz = str4;
        this.zzA = str5;
        this.zzB = zzccgVar;
        this.zzC = str6;
        this.zzD = jSONObject7;
        this.zzE = jSONObject8;
        this.zzK = z10;
        this.zzL = z11;
        this.zzM = z12;
        this.zzN = z13;
        this.zzO = z14;
        this.zzP = z15;
        this.zzQ = z16;
        this.zzR = i11;
        this.zzS = i12;
        this.zzU = z17;
        this.zzV = str7;
        this.zzW = new zzfcg(jSONObject9);
        this.zzX = z18;
        this.zzY = z19;
        this.zzZ = i13;
        this.zzaa = str8;
        this.zzab = i14;
        this.zzac = str9;
        this.zzad = z20;
        this.zzae = zzbybVar;
        this.zzaf = z21;
        this.zzag = zzsVar;
        this.zzah = str10;
        this.zzai = z22;
        this.zzaj = jSONObject10;
        this.zzF = str11;
        this.zzG = str12;
        this.zzH = str13;
        this.zzI = str14;
        this.zzJ = str15;
        this.zzak = z23;
        this.zzal = jSONObject11;
        this.zzam = z24;
        this.zzan = str;
        this.zzao = z25;
        this.zze = zzfrjVar;
        this.zzT = z26;
        this.zzap = str16;
    }

    public static String zza(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return NetworkName.UNKNOWN;
        }
    }

    private static int zzb(String str) {
        if (AdView.AdType.BANNER.equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if (RNAdsEvents.EVENT_REWARDED.equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str) || "app_open_ad_v2".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i10) {
        if (i10 == 0 || i10 == 1) {
            return i10;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if (DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE.equalsIgnoreCase(str)) {
            return 6;
        }
        return DtbDeviceDataRetriever.ORIENTATION_PORTRAIT.equalsIgnoreCase(str) ? 7 : -1;
    }
}
