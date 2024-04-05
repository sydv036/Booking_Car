<template>
  <div id="booking" class="section">
    <div class="section-center">
      <div class="container">
        <div class="row">
          <div class="booking-form">
            <div class="form-header">
              <h1>Nhà xe malibu</h1>
            </div>
            <form>
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group">
                    <span class="form-label">Địa điểm khởi hành</span>
                    <select class="form-control">
                      <option selected>Vui lòng chọn địa điểm khởi hành</option>
                      <option>2</option>
                      <option>3</option>
                    </select>
                    <span class="select-arrow"></span>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-group">
                    <span class="form-label">Địa điểm đến</span>
                    <select class="form-control">
                      <option selected>Vui lòng chọn địa điểm đến</option>
                      <option>1</option>
                      <option>2</option>
                    </select>
                    <span class="select-arrow"></span>
                  </div>
                </div>
                <div class="col-md-12">
                  <div class="form-group">
                    <span class="form-label">Thời gian</span>
                    <input type="date" class="form-control" />
                  </div>
                </div>
                <div class="btn-action-search">
                  <div class="form-btn">
                    <button class="submit-btn">Tìm kiếm</button>
                  </div>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  setup() {},
};
</script>
<style>
@import "@/custom/css/Comp_home.css";
</style>
