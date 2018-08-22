package pe.ayni.aynicore.credito.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class DetalleCronogramaCreditoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer idCuenta;
	
	private Integer nroCondicion;

	private Integer nroCuota;
	
	private Integer nroConcepto;
	
	private String ctaContable;
	
	private LocalDate fechaVencimiento;
	
	private BigDecimal saldoCapital;
	
	private BigDecimal montoCobrar;
	
	private BigDecimal montoPagado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	public Integer getNroCondicion() {
		return nroCondicion;
	}

	public void setNroCondicion(Integer nroCondicion) {
		this.nroCondicion = nroCondicion;
	}

	public Integer getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(Integer nroCuota) {
		this.nroCuota = nroCuota;
	}

	public Integer getNroConcepto() {
		return nroConcepto;
	}

	public void setNroConcepto(Integer nroConcepto) {
		this.nroConcepto = nroConcepto;
	}

	public String getCtaContable() {
		return ctaContable;
	}

	public void setCtaContable(String ctaContable) {
		this.ctaContable = ctaContable;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public BigDecimal getSaldoCapital() {
		return saldoCapital;
	}

	public void setSaldoCapital(BigDecimal saldoCapital) {
		this.saldoCapital = saldoCapital;
	}

	public BigDecimal getMontoCobrar() {
		return montoCobrar;
	}

	public void setMontoCobrar(BigDecimal montoCobrar) {
		this.montoCobrar = montoCobrar;
	}

	public BigDecimal getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(BigDecimal montoPagado) {
		this.montoPagado = montoPagado;
	}

}
