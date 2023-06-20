package com.amazon.device.ads;

import com.amazon.device.ads.DTBMetricReport;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class DTBMetricsProcessor {
    static String ALERT_SDK_WRAPPING = "alert_sdk_wrapping";
    static String ALERT_SDK_WRAPPING_V2 = "alert_sdk_wrapping_v2";
    static String REPORT_LOAD_FAILURE = "fetch_failure";
    static String REPORT_LOAD_LATENCY = "fetch_latency";
    static String REPORT_LOST_BID = "lost_bid";
    static String REPORT_MEDIATION_LATENCY = "mediation_latency";
    private static String SIMPLE_TAG = "DTB_Metrics";
    private static DTBMetricsProcessor theProcessor = new DTBMetricsProcessor();
    private final Object lock = new Object();
    private List<DTBMetricReport> reportQueue = new ArrayList();
    private boolean running;

    private DTBMetricsProcessor() {
    }

    public static /* synthetic */ void a(DTBMetricsProcessor dTBMetricsProcessor) {
        dTBMetricsProcessor.lambda$dispenseReport$1();
    }

    private void addReport(DTBMetricReport dTBMetricReport) {
        synchronized (this.reportQueue) {
            this.reportQueue.add(dTBMetricReport);
        }
    }

    public static /* synthetic */ void b(DTBMetricsProcessor dTBMetricsProcessor, List list) {
        dTBMetricsProcessor.lambda$submitExpiredReport$0(list);
    }

    private static String cacheBusterQueryString() {
        return AdRegistration.isTestMode() ? "?cb=0" : String.format("?cb=%d", Integer.valueOf((int) (Math.random() * 1.0E7d)));
    }

    private void dispenseReport() {
        if (isMainThread()) {
            DtbThreadService.getInstance().execute(new Runnable() { // from class: com.amazon.device.ads.h0
                @Override // java.lang.Runnable
                public final void run() {
                    DTBMetricsProcessor.a(DTBMetricsProcessor.this);
                }
            });
        } else {
            lambda$dispenseReport$1();
        }
    }

    /* renamed from: dispenseReportImpl */
    public void lambda$dispenseReport$1() {
        synchronized (this.lock) {
            if (this.running) {
                return;
            }
            this.running = true;
            while (this.reportQueue.size() > 0) {
                DTBMetricReport dTBMetricReport = this.reportQueue.get(0);
                if (!DTBMetricsConfiguration.getInstance().isTypeEnabled(dTBMetricReport.getType())) {
                    String str = SIMPLE_TAG;
                    DtbLog.debug(str, "Report type:" + dTBMetricReport.getType() + " is ignored");
                    removeFromQueue();
                } else {
                    try {
                        String completeURLForPixelsBasedOnReportURL = getCompleteURLForPixelsBasedOnReportURL(dTBMetricReport);
                        String str2 = SIMPLE_TAG;
                        DtbLog.debug(str2, "Report URL:\n" + completeURLForPixelsBasedOnReportURL + "\nType:" + dTBMetricReport.getType());
                        String str3 = SIMPLE_TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Report:\n");
                        sb2.append(dTBMetricReport);
                        DtbLog.debug(str3, sb2.toString());
                        new DtbHttpClient(completeURLForPixelsBasedOnReportURL).executeGET(60000);
                        removeFromQueue();
                        DtbLog.debug(SIMPLE_TAG, "Report Submission Success");
                    } catch (MalformedURLException e10) {
                        DtbLog.warn("Malformed Exception:" + e10.getMessage());
                    } catch (IOException e11) {
                        DtbLog.warn("IOException:" + e11.getMessage());
                        DtbLog.debug(SIMPLE_TAG, "Report Submission Failure");
                    } catch (JSONException e12) {
                        DtbLog.warn("JSON Exception:" + e12.getMessage());
                        removeFromQueue();
                    }
                }
            }
            this.running = false;
        }
    }

    private String getCompleteURLForPixelsBasedOnReportURL(DTBMetricReport dTBMetricReport) throws UnsupportedEncodingException {
        String str;
        if (dTBMetricReport.getHostname() != null && dTBMetricReport.getHostname().trim().length() != 0) {
            str = dTBMetricReport.getHostname();
        } else {
            str = DtbConstants.AAX_HOSTNAME;
        }
        if (dTBMetricReport.getBidId() != null && dTBMetricReport.getBidId().trim().length() != 0) {
            return String.format("%s/x/px/%s/%s%s", str, dTBMetricReport.getBidId(), dTBMetricReport.toEncodedString(), cacheBusterQueryString());
        }
        return String.format("%s/x/px/p/PH/%s%s", str, dTBMetricReport.toEncodedString(), cacheBusterQueryString());
    }

    public static DTBMetricsProcessor getInstance() {
        return theProcessor;
    }

    private boolean isMainThread() {
        return DTBAdUtil.isMainThread();
    }

    private void removeFromQueue() {
        synchronized (this.reportQueue) {
            this.reportQueue.remove(0);
        }
    }

    /* renamed from: submitExpiredReportImpl */
    public void lambda$submitExpiredReport$0(List<DTBMetricReport.BidWrapper> list) {
        for (DTBMetricReport.BidWrapper bidWrapper : list) {
            addReport(DTBMetricReport.reportWithBidIdAndType(bidWrapper, REPORT_LOST_BID));
        }
        dispenseReport();
    }

    void submitErrorReport(String str, Map<String, Object> map) {
        addReport(DTBMetricReport.reportWithTypeAndExtraProperties(str, map));
        dispenseReport();
    }

    public void submitExpiredReport(final List<DTBMetricReport.BidWrapper> list) {
        if (isMainThread()) {
            DtbThreadService.getInstance().execute(new Runnable() { // from class: com.amazon.device.ads.i0
                @Override // java.lang.Runnable
                public final void run() {
                    DTBMetricsProcessor.b(DTBMetricsProcessor.this, list);
                }
            });
        } else {
            lambda$submitExpiredReport$0(list);
        }
    }

    public void submitLatencyReportBidId(DTBMetricReport.BidWrapper bidWrapper, String str, int i10) {
        addReport(DTBMetricReport.reportWithBidTypeLatency(bidWrapper, str, i10));
        dispenseReport();
    }

    public void submitSimpleReportBidId(DTBMetricReport.BidWrapper bidWrapper, String str) {
        addReport(DTBMetricReport.reportWithBidIdAndType(bidWrapper, str));
        dispenseReport();
    }

    public void submitErrorReport(String str, Map<String, Object> map, DTBMetricReport.BidWrapper bidWrapper) {
        addReport(DTBMetricReport.reportWithTypeAndExtraProperties(str, map, bidWrapper));
        dispenseReport();
    }
}
