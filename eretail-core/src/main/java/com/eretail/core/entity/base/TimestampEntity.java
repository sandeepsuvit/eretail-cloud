/**
 * 
 */
package com.eretail.core.entity.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.joda.time.DateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author sandeep
 *
 */
@SuppressWarnings("serial")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public class TimestampEntity extends BaseEntity {
	@Column(name = "created_date", nullable = false, insertable = false, updatable = false, columnDefinition = "timestamp without time zone NOT NULL DEFAULT timezone('utc'::text, now())")
	private DateTime createdDate;

	@Column(name = "last_updated_date")
	private DateTime lastUpdatedDate;

	@PrePersist
	protected void onTimeStampEntityCreate() {
		lastUpdatedDate = createdDate = new DateTime();
	}

	@PreUpdate
	protected void onTimeStampEntityUpdate() {
		lastUpdatedDate = new DateTime();
	}
}
