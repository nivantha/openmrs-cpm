package org.openmrs.module.cpm;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.User;

/**
 * This extends the SharedProposal to represent a persisted Concept Proposal on the reviewers side
 * of the Concept Proposal exchange. This will be persisted on the reviewer instance of OpenMRS, by
 * server side REST services. Given that the ids on both the client and server sides will be
 * different, the underlying UUID will be used to test for equality.
 * 
 * @see ConceptProposalReview
 */
public class ConceptProposalResponse extends ShareableProposal {
	
	private static Log log = LogFactory.getLog(ConceptProposalResponse.class);
	
	private Integer conceptProposalResponseId;
	private String conceptProposalUuid;
	private User creator;
	private Date dateCreated;
	private User changedBy;
	private Date dateChanged;
	private Integer version;
	
	/**
	 * Create the server side Concept Proposal Response based on the proposer submitted Concept Proposal.
	 * This changes the status of the proposal to reflect that this is in the first state of the server 
	 * side workflow
	 * 
	 * @param shareableProposal The Concept Proposal submitted by a client side proposer
	 */
	public ConceptProposalResponse(ShareableProposal shareableProposal) {
		log.debug("Creating a new ConceptProposalResponse from: " + shareableProposal);
		
		this.setName(shareableProposal.getName());
		this.setConceptProposalUuid(shareableProposal.getUuid());
		this.setComments(shareableProposal.getComments());
		this.setStatus(ProposalStatus.RECEIVED);		
	}
	
 	public Integer getId() {
		return conceptProposalResponseId;
	}
	
	public void setId(Integer id) {
		this.conceptProposalResponseId = id;
	}
	
	public String getConceptProposalUuid() {
		return conceptProposalUuid;
	}
	
	public void setConceptProposalUuid(String conceptProposalUuid) {
		this.conceptProposalUuid = conceptProposalUuid;
	}
	
	public Integer getConceptProposalReviewId() {
		return conceptProposalResponseId;
	}
	
	public void setConceptProposalReviewId(Integer conceptProposalReviewId) {
		this.conceptProposalResponseId = conceptProposalReviewId;
	}
	
	public User getCreator() {
		return creator;
	}
	
	public void setCreator(User creator) {
		this.creator = creator;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public User getChangedBy() {
		return changedBy;
	}
	
	public void setChangedBy(User changedBy) {
		this.changedBy = changedBy;
	}
	
	public Date getDateChanged() {
		return dateChanged;
	}
	
	public void setDateChanged(Date dateChanged) {
		this.dateChanged = dateChanged;
	}
	
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
	
}