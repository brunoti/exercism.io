const DNA_RNA_OBJECT = {
  'G' : 'C',
  'C' : 'G',
  'T' : 'A',
  'A' : 'U',
};

const corresponding = nucleotide => DNA_RNA_OBJECT[nucleotide];

const RnaTranscriber = function() {};

RnaTranscriber.prototype.toRna = function(dna) {
  const rna = dna.split('').map(corresponding);

  if(!rna.every(Boolean)) {
    throw new Error('Invalid input');
  }

  return rna.join('');
};

module.exports = RnaTranscriber;
