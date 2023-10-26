class Solution {
        fun solution(phone_number: String): String {
            var answer = ""
            when(phone_number.length){
                20->answer = phone_number.replaceRange(0..15,"****************")
                19->answer = phone_number.replaceRange(0..14,"***************")
                18->answer = phone_number.replaceRange(0..13,"**************")
                17->answer = phone_number.replaceRange(0..12,"*************")
                16->answer = phone_number.replaceRange(0..11,"************")
                15->answer = phone_number.replaceRange(0..10,"***********")
                14->answer = phone_number.replaceRange(0..9,"**********")
                13->answer = phone_number.replaceRange(0..8,"*********")
                12->answer = phone_number.replaceRange(0..7,"********")
                11->answer = phone_number.replaceRange(0..6,"*******")
                10->answer = phone_number.replaceRange(0..5,"******")
                9->answer = phone_number.replaceRange(0..4,"*****")
                8->answer = phone_number.replaceRange(0..3,"****")
                7->answer = phone_number.replaceRange(0..2,"***")
                6->answer = phone_number.replaceRange(0..1,"**")
                5->answer = phone_number.replaceRange(0..0,"*")
                4->answer = phone_number
            }
            
            return answer
        }
    }