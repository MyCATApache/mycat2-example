/**
 * Copyright (C) <2019>  <chen junwen>
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program.  If
 * not, see <http://www.gnu.org/licenses/>.
 */
package io.mycat.app.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jamie12221
 *  date 2019-05-24 00:59
 **/
public class TravelRecord {
  long id;
  long userId;
  Date travelDate;
  BigDecimal fee;
  long days;

  public void setId(long id) {
    this.id = id;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public void setTravelDate(Date travelDate) {
    this.travelDate = travelDate;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public void setDays(long days) {
    this.days = days;
  }
}
