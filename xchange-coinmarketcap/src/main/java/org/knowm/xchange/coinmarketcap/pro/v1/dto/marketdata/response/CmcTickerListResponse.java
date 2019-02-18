package org.knowm.xchange.coinmarketcap.pro.v1.dto.marketdata.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.coinmarketcap.pro.v1.dto.CmcResult;
import org.knowm.xchange.coinmarketcap.pro.v1.dto.marketdata.CmcStatus;
import org.knowm.xchange.coinmarketcap.pro.v1.dto.marketdata.CmcTicker;

import java.util.List;

public final class CmcTickerListResponse extends CmcResult<List<CmcTicker>> {

  public CmcTickerListResponse(
      @JsonProperty("status") CmcStatus status, @JsonProperty("result") List<CmcTicker> data) {

    super(data, status);
  }
}
